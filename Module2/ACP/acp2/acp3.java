import java.util.Scanner;

public class VolumeOfCuboid {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input dimensions
        System.out.print("Enter the length: ");
        double length = sc.nextDouble();

        System.out.print("Enter the width: ");
        double width = sc.nextDouble();

        System.out.print("Enter the height: ");
        double height = sc.nextDouble();

        // Calculate volume
        double volume = length * width * height;

        // Display result
        System.out.println("Volume of the cuboid = " + volume);

        sc.close();
    }
}