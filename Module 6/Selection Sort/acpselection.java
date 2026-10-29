```java
import java.util.*;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size
        int n = sc.nextInt();

        int[] a = new int[n];

        // Input array
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Create a copy of the original array
        int[] sorted = a.clone();

        // Selection Sort
        for (int i = 0; i < n - 1; i++) {

            int minIndex = i;

            // Find the smallest element
            // in the remaining array
            for (int j = i + 1; j < n; j++) {

                if (sorted[j] < sorted[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap
            int temp = sorted[i];
            sorted[i] = sorted[minIndex];
            sorted[minIndex] = temp;
        }

        // Find the sorted position of every
        // element from the original array
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                if (a[i] == sorted[j]) {
                    System.out.print(j + " ");
                    break;
                }
            }
        }

        sc.close();
    }
}
```
