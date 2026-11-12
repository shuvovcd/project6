import java.util.Scanner;

public class RectangleArea {

    public static int calculateArea(int length, int width) {
        return length * width;
    }

    public static double calculateArea(double length, double width) {
        return length * width;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type 1 for integers, or 2 for doubles:");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter integer length: ");
            int length = scanner.nextInt();
            System.out.print("Enter integer width: ");
            int width = scanner.nextInt();
            System.out.println("Area: " + calculateArea(length, width));
        } else {
            System.out.print("Enter double length: ");
            double length = scanner.nextDouble();
            System.out.print("Enter double width: ");
            double width = scanner.nextDouble();
            System.out.println("Area: " + calculateArea(length, width));
        }

        scanner.close();
    }
}
