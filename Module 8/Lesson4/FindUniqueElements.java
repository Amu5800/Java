import java.util.ArrayList;
import java.util.Scanner;

public class FindUniqueElements {

    public static ArrayList<String> findUniqueElements(
            ArrayList<String> list) {

        ArrayList<String> unique = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            String element = list.get(i);

            if (!unique.contains(element)) {
                unique.add(element);
            }
        }

        return unique;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the strings:");

        for (int i = 0; i < n; i++) {
            list.add(sc.nextLine());
        }

        ArrayList<String> result = findUniqueElements(list);

        System.out.println("Original ArrayList: " + list);
        System.out.println("Unique elements: " + result);

        sc.close();
    }
} {
    
}
