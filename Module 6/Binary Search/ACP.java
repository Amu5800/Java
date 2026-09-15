```java
import java.util.*;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Size of array
        int n = sc.nextInt();

        // Create array
        int[] a = new int[n];

        // Input array elements
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Input the denomination to search
        int d = sc.nextInt();

        int left = 0;
        int right = n - 1;

        int ceil = -1;
        int floor = -1;

        // Binary Search
        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (a[mid] == d) {
                // d itself is available
                ceil = a[mid];
                floor = a[mid];
                break;
            }

            else if (a[mid] < d) {
                // Current value can be a floor
                floor = a[mid];

                // Search on the right side
                left = mid + 1;
            }

            else {
                // Current value can be a ceil
                ceil = a[mid];

                // Search on the left side
                right = mid - 1;
            }
        }

        // Print ceil and floor
        System.out.println(ceil);
        System.out.println(floor);

        sc.close();
    }
}
```
