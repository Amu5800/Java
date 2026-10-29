package Lesson2;

public 

import java.util.Arrays;
import java.util.Scanner;

public class FindMedian {

    public static double findMedian(int[] arr) {
        Arrays.sort(arr);

        int n = arr.length;

        if (n % 2 != 0) {
            // Odd length: return the middle element
            return arr[n / 2];
        } else {
            // Even length: average the two middle elements
            return (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Array must contain at least one element.");
            sc.close();
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        double median = findMedian(arr);

        System.out.println("Median: " + median);

        sc.close();
    }
} {
    
}
