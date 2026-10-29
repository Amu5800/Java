public import java.util.Scanner;

public class MinZeroColumn {

    public static int minZeroColumn(int[][] arr) {
        int minZeros = arr.length + 1;
        int minColumn = 0;

        for (int j = 0; j < arr[0].length; j++) {
            int count = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i][j] == 0) {
                    count++;
                }
            }

            if (count < minZeros) {
                minZeros = count;
                minColumn = j;
            }
        }

        return minColumn;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        System.out.println("Enter array elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int result = minZeroColumn(arr);

        System.out.println("Column with minimum zeros: " + result);

        sc.close();
    }
} {
    
}
