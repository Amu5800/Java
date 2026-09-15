```java
import java.util.*;

class Main {

    // Function to sort an array
    static void sortArray(int[] arr) {
        Arrays.sort(arr);
    }

    // Function to merge two sorted arrays
    static int[] mergeArrays(int[] a, int[] b) {

        int[] result = new int[a.length + b.length];

        int i = 0;  // pointer for array a
        int j = 0;  // pointer for array b
        int k = 0;  // pointer for result

        // Compare elements of both arrays
        while (i < a.length && j < b.length) {

            if (a[i] < b[j]) {
                result[k] = a[i];
                i++;
            } else {
                result[k] = b[j];
                j++;
            }

            k++;
        }

        // Copy remaining elements of array a
        while (i < a.length) {
            result[k] = a[i];
            i++;
            k++;
        }

        // Copy remaining elements of array b
        while (j < b.length) {
            result[k] = b[j];
            j++;
            k++;
        }

        return result;
    }

    public static void main(String[] args) {

        int[] a = {1, 8, 3, 6};
        int[] b = {2, 0, 4, 9};

        // Sort both arrays
        sortArray(a);
        sortArray(b);

        // Merge the sorted arrays
        int[] result = mergeArrays(a, b);

        // Print final array
        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}
```
