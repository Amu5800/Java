```java
import java.util.*;

class Main {

    // This function counts reverse pairs
    // and also sorts the array
    static long mergeSort(int[] nums, int left, int right) {

        // Base case
        if (left >= right) {
            return 0;
        }

        // Find middle
        int mid = left + (right - left) / 2;

        // Count pairs in left half
        long count = mergeSort(nums, left, mid);

        // Count pairs in right half
        count += mergeSort(nums, mid + 1, right);

        // Count reverse pairs between
        // left half and right half
        int j = mid + 1;

        for (int i = left; i <= mid; i++) {

            while (j <= right &&
                   (long) nums[i] > 2L * nums[j]) {
                j++;
            }

            count += j - (mid + 1);
        }

        // Merge the two sorted halves
        merge(nums, left, mid, right);

        return count;
    }

    // Merge two sorted parts
    static void merge(int[] nums, int left, int mid, int right) {

        int[] temp = new int[right - left + 1];

        int i = left;
        int j = mid + 1;
        int k = 0;

        // Compare elements from both halves
        while (i <= mid && j <= right) {

            if (nums[i] <= nums[j]) {
                temp[k] = nums[i];
                i++;
            } else {
                temp[k] = nums[j];
                j++;
            }

            k++;
        }

        // Copy remaining elements from left half
        while (i <= mid) {
            temp[k] = nums[i];
            i++;
            k++;
        }

        // Copy remaining elements from right half
        while (j <= right) {
            temp[k] = nums[j];
            j++;
            k++;
        }

        // Copy back into original array
        for (int x = 0; x < temp.length; x++) {
            nums[left + x] = temp[x];
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Input array
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Find number of reverse pairs
        long answer = mergeSort(nums, 0, n - 1);

        // Print answer
        System.out.println(answer);

        sc.close();
    }
}
```
