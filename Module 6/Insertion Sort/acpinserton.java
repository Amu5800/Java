```java
import java.util.*;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step 1: Take the size of the array
        int n = sc.nextInt();

        // Step 2: Create the array
        int[] a = new int[n];

        // Step 3: Take array elements
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Step 4: Make a copy of the original array
        int[] sorted = a.clone();

        // Step 5: Insertion Sort
        for (int i = 1; i < n; i++) {

            // Store the current element
            int key = sorted[i];

            // Start comparing with the previous element
            int j = i - 1;

            // Shift larger elements to the right
            while (j >= 0 && sorted[j] > key) {
                sorted[j + 1] = sorted[j];
                j--;
            }

            // Put key at its correct position
            sorted[j + 1] = key;
        }

        // Step 6: Find the sorted position
        // of every element in the original array
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
