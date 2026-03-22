class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    void work() {
        System.out.println(name + " works as an employee");
    }

    void salary() {
        System.out.println("Base salary");
    }

    void salary(int bonus) {
        System.out.println("Salary with bonus: " + bonus);
    }
}


class BackendEmployee extends Employee {

    BackendEmployee(String name) {
        super(name);
    }

    @Override
    void work() {
        System.out.println(name + " works on Backend using Java");
    }
}


class FrontendEmployee extends Employee {

    FrontendEmployee(String name) {
        super(name);
    }

    @Override
    void work() {
        System.out.println(name + " works on Frontend using React");
    }
}


class TesterEmployee extends Employee {

    TesterEmployee(String name) {
        super(name);
    }

    @Override
    void work() {
        System.out.println(name + " tests the software");
    }
}


class SeniorBackendEmployee extends BackendEmployee {

    SeniorBackendEmployee(String name) {
        super(name);
    }

    @Override
    void work() {
        System.out.println(name + " works as Senior Backend Developer");
    }
}


public class Main {

    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);

        int choice;

        do {
            System.out.println("\n===== Employee Menu =====");
            System.out.println("1. Base Employee");
            System.out.println("2. Backend Employee");
            System.out.println("3. Frontend Employee");
            System.out.println("4. Tester Employee");
            System.out.println("5. Senior Backend Employee");
            System.out.println("6. Show Salary (Overloading)");
            System.out.println("0. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    Employee e1 = new Employee("Ravi");
                    e1.work();
                    break;

                case 2:
                    Employee e2 = new BackendEmployee("Amit");
                    e2.work();
                    break;

                case 3:
                    Employee e3 = new FrontendEmployee("Neha");
                    e3.work();
                    break;

                case 4:
                    Employee e4 = new TesterEmployee("Karan");
                    e4.work();
                    break;

                case 5:
                    Employee e5 = new SeniorBackendEmployee("Suresh");
                    e5.work();
                    break;

                case 6:
                    Employee e = new Employee("SalaryDemo");
                    e.salary();
                    e.salary(5000);
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
