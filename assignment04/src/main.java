import java.util.Scanner;

class Shapes {

    double radius, length, breadth, base, height;

    // Constructor for circle
    Shapes(double r) {
        radius = r;
    }

    // Constructor for rectangle
    Shapes(double l, double b) {
        length = l;
        breadth = b;
    }

    // Constructor for triangle
    Shapes(double b, double h, int x) {
        base = b;
        height = h;
    }

    // Method overloading

    void area(double r) {
        System.out.println("Area of Circle = " + (3.14 * r * r));
    }

    void area(double l, double b) {
        System.out.println("Area of Rectangle = " + (l * b));
    }

    void area(double b, double h, int x) {
        System.out.println("Area of Triangle = " + (0.5 * b * h));
    }
}


public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {

            System.out.println("\n==== SHAPES MENU ====");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Triangle");
            System.out.println("0. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter radius: ");
                    double r = sc.nextDouble();

                    Shapes s1 = new Shapes(r);   // constructor overloading
                    s1.area(r);                 // method overloading

                    break;

                case 2:

                    System.out.print("Enter length: ");
                    double l = sc.nextDouble();

                    System.out.print("Enter breadth: ");
                    double b = sc.nextDouble();

                    Shapes s2 = new Shapes(l, b);
                    s2.area(l, b);

                    break;

                case 3:

                    System.out.print("Enter base: ");
                    double base = sc.nextDouble();

                    System.out.print("Enter height: ");
                    double h = sc.nextDouble();

                    Shapes s3 = new Shapes(base, h, 1);
                    s3.area(base, h, 1);

                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 0);

        sc.close();
    }
}