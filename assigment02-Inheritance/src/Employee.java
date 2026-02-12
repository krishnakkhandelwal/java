class Employee {

    protected String name;
    protected double salary;

    Employee(String n, double s) {
        name = n;
        salary = s;
    }

    void displaySalary() {
        System.out.println("\nEmployee Name: " + name);
        System.out.println("Salary before hike: " + salary);
    }
}
