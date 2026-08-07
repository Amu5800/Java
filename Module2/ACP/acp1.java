import java.util.Scanner;

public class StudentRegistration {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input student details
        System.out.println("===== Student Registration Form =====");

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // Consume newline

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Gender: ");
        String gender = sc.nextLine();

        System.out.print("Enter Course: ");
        String course = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        System.out.print("Enter Mobile Number: ");
        long mobile = sc.nextLong();

        // Display student details
        System.out.println("\n===== Registration Successful =====");
        System.out.println("Student ID      : " + id);
        System.out.println("Student Name    : " + name);
        System.out.println("Age             : " + age);
        System.out.println("Gender          : " + gender);
        System.out.println("Course          : " + course);
        System.out.println("Email           : " + email);
        System.out.println("Mobile Number   : " + mobile);

        sc.close();
    }
}