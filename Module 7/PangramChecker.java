
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String str = sc.nextLine();

        // Convert the sentence to lowercase
        str = str.toLowerCase();

        // Array to store the presence of 26 letters
        boolean[] letters = new boolean[26];

        // Count the unique English letters found
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                int index = ch - 'a';

                if (!letters[index]) {
                    letters[index] = true;
                    count++;
                }
            }
        }

        // Check whether all 26 letters are present
        if (count == 26) {
            System.out.println("It is a Pangram.");
        } else {
            System.out.println("It is not a Pangram.");
        }

        sc.close();
    }
}
