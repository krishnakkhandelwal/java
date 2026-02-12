import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        FullTimeEmployee[] fullTimers = {
                new FullTimeEmployee("Krishna", 50000),
                new FullTimeEmployee("Aman", 60000)
        };

        InternEmployee[] interns = {
                new InternEmployee("Riya", 20000),
                new InternEmployee("Neha", 22000)
        };

        while (true) {
            System.out.println("\n===== EMPLOYEE MENU =====");
            System.out.println("1. Display ALL employees");
            System.out.println("2. Display FULL TIME employees");
            System.out.println("3. Display INTERN employees");
            System.out.println("4. Apply salary hike to FULL TIME employees");
            System.out.println("5. Apply salary hike to INTERN employees");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            // ALL employees
            if (choice == 1) {
                for (FullTimeEmployee f : fullTimers)
                    f.displaySalary();
                for (InternEmployee i : interns)
                    i.displaySalary();
            }

            // Only full time
            else if (choice == 2) {
                for (FullTimeEmployee f : fullTimers)
                    f.displaySalary();
            }

            // Only interns
            else if (choice == 3) {
                for (InternEmployee i : interns)
                    i.displaySalary();
            }

            // Hike full time
            else if (choice == 4) {
                for (FullTimeEmployee f : fullTimers) {
                    f.displaySalary();
                    f.calculateSalary();
                }
            }

            // Hike interns
            else if (choice == 5) {
                for (InternEmployee i : interns) {
                    i.displaySalary();
                    i.calculateSalary();
                }
            }

            else if (choice == 6) {
                System.out.println("Exiting program...");
                break;
            }

            else {
                System.out.println("Invalid choice!");
            }
        }
    }
}
