class InternEmployee extends Employee {

    InternEmployee(String n, double s) {
        super(n, s);
    }

    void calculateSalary() {
        salary = salary + salary * 0.25;
        System.out.println("Salary after 25% hike: " + salary);
    }
}
