````java
import java.util.*;

class Main {

    // Swap two apples
    static void swap(long[][] a, int i, int j) {
        long[] temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    // Compare two apples
    // First compare X, then compare Y
    static boolean smaller(long[] a, long[] b) {

        if (a[0] != b[0]) {
            return a[0] < b[0];
        }

        return a[1] < b[1];
    }

    // Quick Sort
    static void quickSort(long[][] a, int low, int high) {

        if (low >= high) {
            return;
        }

        int i = low;
        int j = high;

        // Choose middle element as pivot
        long[] pivot = a[low + (high - low) / 2];

        while (i <= j) {

            // Move i while current apple is smaller than pivot
            while (smaller(a[i], pivot)) {
                i++;
            }

            // Move j while pivot is smaller than current apple
            while (smaller(pivot, a[j])) {
                j--;
            }

            // Swap
            if (i <= j) {
                swap(a, i, j);
                i++;
                j--;
            }
        }

        // Sort left part
        if (low < j) {
            quickSort(a, low, j);
        }

        // Sort right part
        if (i < high) {
            quickSort(a, i, high);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Number of apples
        int n = sc.nextInt();

        // Store coordinates of apples
        long[][] apples = new long[n][2];

        for (int i = 0; i < n; i++) {
            apples[i][0] = sc.nextLong(); // X coordinate
            apples[i][1] = sc.nextLong(); // Y coordinate
        }

        // Sort apples using Quick Sort
        quickSort(apples, 0, n - 1);

        // After sorting, index = number of apples eaten before it
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }

        sc.close();
    }
}

