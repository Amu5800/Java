
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create an ArrayList to store characters
        ArrayList<Character> chars = new ArrayList<>();

        System.out.print("Enter the number of characters: ");
        int n = sc.nextInt();

        // Take characters as input
        for (int i = 0; i < n; i++) {
            System.out.print("Enter character " + (i + 1) + ": ");
            char ch = sc.next().charAt(0);
            chars.add(ch);
        }

        // Construct a String from the ArrayList
        String str = "";
        for (char ch : chars) {
            str = str + ch;
        }

        // Display the original String
        System.out.println("Original String: " + str);

        // Find the length of the String
        System.out.println("Length: " + str.length());

        // Reverse the String
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        System.out.println("Reversed String: " + reverse);

        // Divide the String into two equal-length words
        if (str.length() % 2 == 0) {
            int mid = str.length() / 2;

            String word1 = str.substring(0, mid);
            String word2 = str.substring(mid);

            System.out.println("First Word: " + word1);
            System.out.println("Second Word: " + word2);
        } else {
            System.out.println(
                "The String cannot be divided into two equal-length words."
            );
        }

        sc.close();
    }
}
