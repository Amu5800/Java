
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an email ID: ");
        String email = sc.nextLine();

        System.out.println("Frequency of numeric and special characters:");

        for (int i = 0; i < email.length(); i++) {
            char ch = email.charAt(i);

            // Check if the character is a digit or special character
            if (!Character.isLetter(ch)) {
                int count = 0;

                // Count the frequency of the character
                for (int j = 0; j < email.length(); j++) {
                    if (email.charAt(j) == ch) {
                        count++;
                    }
                }

                // Print only the first occurrence
                boolean alreadyPrinted = false;

                for (int k = 0; k < i; k++) {
                    if (email.charAt(k) == ch) {
                        alreadyPrinted = true;
                        break;
                    }
                }

                if (!alreadyPrinted) {
                    System.out.println(ch + " --> " + count);
                }
            }
        }

        sc.close();
    }
}
