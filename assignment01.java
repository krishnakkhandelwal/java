class Student {
    // Data members (private for encapsulation)
    private int rollNo;
    private String name;
    private int marks;

    // Default constructor
    Student() {
        rollNo = 0;
        name = "Unknown";
        marks = 0;
    }

    // Parameterized constructor
    Student(int r, String n, int m) {
        rollNo = r;
        name = n;
        marks = m;
    }

    // Method to calculate grade (returns value)
    String getGrade() {
        if (marks >= 75)
            return "Distinction";
        else if (marks >= 60)
            return "First Class";
        else if (marks >= 50)
            return "Second Class";
        else
            return "Fail";
    }

    // Method to display student info
    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + getGrade());
        System.out.println("--------------------");
    }
}

public class StudentDemo {
    public static void main(String[] args) {

        // Object creation
        Student s1 = new Student();   // default constructor
        Student s2 = new Student(101, "Rahul", 82); // parameterized constructor

        // Calling methods
        s1.display();
        s2.display();
    }
}
