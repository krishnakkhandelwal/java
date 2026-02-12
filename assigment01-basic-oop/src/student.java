class Student {
    private String name;
    private int age;
    private double sub1Marks;
    private double sub2Marks;
    private double sub3Marks;

    // constructor
    Student(String n, int a, double s1, double s2, double s3) {
        name = n;
        age = a;
        sub1Marks = s1;
        sub2Marks = s2;
        sub3Marks = s3;
    }

    void displayInfo() {
        System.out.println("\nName: " + name);
        System.out.println("Age: " + age);
        System.out.println("Subject 1: " + sub1Marks);
        System.out.println("Subject 2: " + sub2Marks);
        System.out.println("Subject 3: " + sub3Marks);
    }

    // average
    double calcStudentAverage() {

        return (sub1Marks + sub2Marks + sub3Marks) / 3;
    }

    // getters subject averages
    double getSub1Marks() {
        return sub1Marks;
    }
    double getSub2Marks() {
        return sub2Marks;
    }
    double getSub3Marks() {
        return sub3Marks;
    }
}
