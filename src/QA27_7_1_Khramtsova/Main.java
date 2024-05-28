package QA27_7_1_Khramtsova;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        Figure[] figures = new Figure[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Choose type:");
            System.out.println("1. Triangle");
            System.out.println("2. Rectangle");
            System.out.println("3. Circle");
            System.out.print("Your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the sides of the triangle (separated by spaces): ");
                    double a = scanner.nextDouble();
                    double b = scanner.nextDouble();
                    double c = scanner.nextDouble();
                    figures[i] = new Triangle(a, b, c);
                    break;
                case 2:
                    System.out.print("Enter the sides of the rectangle (separated by spaces) ");
                    double sideA = scanner.nextDouble();
                    double sideB = scanner.nextDouble();
                    figures[i] = new Rectangle(sideA, sideB);
                    break;
                case 3:
                    System.out.print("Enter the radius of the circle: ");
                    double radius = scanner.nextDouble();
                    figures[i] = new Circle(radius);
                    break;
                default:
                    System.out.println("Incorrect choice. Please re-enter.");
                    i--;
                    break;
            }
        }

        double sumPerimetr = 0;

        for (Figure figure : figures) {
            sumPerimetr += figure.perimeter();
        }

        System.out.println("The sum of the perimeters of all figures: " + sumPerimetr);
    }

}
