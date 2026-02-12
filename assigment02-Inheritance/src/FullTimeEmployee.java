class FullTimeEmployee extends Employee {

    FullTimeEmployee(String n, double s) {
        super(n, s);
    }

    void calculateSalary() {
        salary = salary + salary * 0.50;
        System.out.println("Salary after 50% hike: " + salary);
    }
}
