import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student[] students = {
                new Student("Krishna", 20, 80, 75, 90),
                new Student("Ayush", 19, 60, 55, 70),
                new Student("Alvin", 21, 85, 88, 92)
        };

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Display all students");
            System.out.println("2. Average marks of each student");
            System.out.println("3. Average marks of each subject");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            if (choice == 1) {
                for (Student s : students)
                    s.displayInfo();
            }

            else if (choice == 2) {
                for (Student s : students)
                    System.out.println("Average = " + s.calcStudentAverage());
            }

            else if (choice == 3) {
                double s1 = 0, s2 = 0, s3 = 0;

                for (Student s : students) {
                    s1 += s.getSub1Marks();
                    s2 += s.getSub2Marks();
                    s3 += s.getSub3Marks();
                }

                int n = students.length;
                System.out.println("Subject1 Avg = " + s1/n);
                System.out.println("Subject2 Avg = " + s2/n);
                System.out.println("Subject3 Avg = " + s3/n);
            }

            else if (choice == 4) {
                System.out.println("Exiting program...");
                break;
            }

            else {
                System.out.println("Invalid choice!");
            }
        }
    }
}
