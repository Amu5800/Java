import java.util.ArrayList;

public class LetterCasePermutation {

    public static void generate(
            String s, int index, String current,
            ArrayList<String> result) {

        // Base case: all characters are processed
        if (index == s.length()) {
            result.add(current);
            return;
        }

        char ch = s.charAt(index);

        // If the character is a letter
        if (Character.isLetter(ch)) {

            // Try lowercase
            generate(s, index + 1,
                    current + Character.toLowerCase(ch), result);

            // Try uppercase
            generate(s, index + 1,
                    current + Character.toUpperCase(ch), result);

        } else {
            // If it is a digit, keep it unchanged
            generate(s, index + 1, current + ch, result);
        }
    }

    public static ArrayList<String> letterCasePermutation(String s) {
        ArrayList<String> result = new ArrayList<>();
        generate(s, 0, "", result);
        return result;
    }

    public static void main(String[] args) {
        String s = "a1b2";

        ArrayList<String> result = letterCasePermutation(s);

        System.out.println(result);
    }
}
