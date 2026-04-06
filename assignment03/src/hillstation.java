import java.util.*;

// Parent Class
class Hillstations {

    void famousfor() {
        System.out.println("Famous for hill views");
    }

    void famousfood() {
        System.out.println("Famous food not specified");
    }

    void showDetails() {
        System.out.println("This is a hill station.");
    }
}

// Child Class 1
class Manali extends Hillstations {

    void famousfor() {
        System.out.println("Manali is famous for snow and adventure sports");
    }

    void famousfood() {
        System.out.println("Famous food: Siddu");
    }

    void showDetails() {
        System.out.println("Located in Himachal Pradesh");
    }
}

// Child Class 2
class Shimla extends Hillstations {

    void famousfor() {
        System.out.println("Shimla is famous for colonial architecture");
    }

    void famousfood() {
        System.out.println("Famous food: Chana Madra");
    }

    void showDetails() {
        System.out.println("Capital of Himachal Pradesh");
    }
}

// Child Class 3
class Darjeeling extends Hillstations {

    void famousfor() {
        System.out.println("Darjeeling is famous for tea gardens");
    }

    void famousfood() {
        System.out.println("Famous food: Momos");
    }

    void showDetails() {
        System.out.println("Located in West Bengal");
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Hillstations h;  // parent reference
        int choice;

        do {
            System.out.println("\n--- HILL STATION MENU ---");
            System.out.println("1. Manali");
            System.out.println("2. Shimla");
            System.out.println("3. Darjeeling");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    h = new Manali();  // runtime polymorphism
                    h.famousfor();
                    h.famousfood();
                    h.showDetails();
                    break;

                case 2:
                    h = new Shimla();
                    h.famousfor();
                    h.famousfood();
                    h.showDetails();
                    break;

                case 3:
                    h = new Darjeeling();
                    h.famousfor();
                    h.famousfood();
                    h.showDetails();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);
    }
}
