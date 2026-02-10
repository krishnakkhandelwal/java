// Base class
class Employee {
    double salary;

    Employee(double s) {
        salary = s;
    }

    void displaySalary() {
        System.out.println("Salary: " + salary);
    }
}

// Derived class 1
class FullTimeEmployee extends Employee {

    FullTimeEmployee(double s) {
        super(s);
    }

    void calculateSalary() {
        System.out.println("Full Time Employee:");
        System.out.println("Before Hike:");
        displaySalary();

        salary = salary + (salary * 0.50); // 50% hike

        System.out.println("After 50% Hike:");
        displaySalary();
        System.out.println("---------------------");
    }
}

// Derived class 2
class InternEmployee extends Employee {

    InternEmployee(double s) {
        super(s);
    }

    void calculateSalary() {
        System.out.println("Intern Employee:");
        System.out.println("Before Hike:");
        displaySalary();

        salary = salary + (salary * 0.25); // 25% hike

        System.out.println("After 25% Hike:");
        displaySalary();
        System.out.println("---------------------");
    }
}

// Main class
public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {

        FullTimeEmployee f1 = new FullTimeEmployee(30000);
        InternEmployee i1 = new InternEmployee(15000);

        f1.calculateSalary();
        i1.calculateSalary();
    }
}
