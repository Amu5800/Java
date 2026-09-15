import java.util.*;

public class ZigZagPattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        // Upper half
        for (int i = 0; i < n; i++) {

            // Print spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Print first star
            System.out.print("*");

            // Print spaces between stars
            for (int j = 0; j < 2 * (n - i - 1); j++) {
                System.out.print(" ");
            }

            // Print second star
            if (i != n - 1) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower half
        for (int i = n - 2; i >= 0; i--) {

            // Print spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Print first star
            System.out.print("*");

            // Print spaces between stars
            for (int j = 0; j < 2 * (n - i - 1); j++) {
                System.out.print(" ");
            }

            // Print second star
            System.out.print("*");

            System.out.println();
        }
    }
}