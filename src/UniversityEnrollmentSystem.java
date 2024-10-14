// Base Class
class Person {
    // Fields for Person
    private String name;
    private int age;

    // Constructor for initializing name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Subclass Student
class Student extends Person {
    // Fields for Student
    private String studentID;
    private String course;
    private int units;
    private final int feePerUnit = 1000;

    // Constructor for Student's Details
    public Student(String name, int age, String studentID, String course, int units) {
        super(name, age); // Calling the constructor of the Person class
        this.studentID = studentID;
        this.course = course;
        this.units = units;
    }

    // Method to calculate fees for student
    public double calculateFees() {
        return units * feePerUnit;
    }

    // Overriding
    public void displayInfo() {
        super.displayInfo(); // Call the displayInfo method of the Person class
        System.out.println("Student ID: " + studentID);
        System.out.println("Course: " + course);
        System.out.println("Units: " + units);
        System.out.println("Total Fees: " + calculateFees());
    }
}

// Subclass Instructor
class Instructor extends Person {
    // Fields for Instructor
    private String employeeID;
    private String department;
    private double salary;

    // Constructor for Instructor's Details
    public Instructor(String name, int age, String employeeID, String department, double salary) {
        super(name, age); // Calling the constructor of the Person class
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Overriding 
    public void displayInfo() {
        super.displayInfo(); // Call the displayInfo method of the Person class
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

// Class to demonstrate polymorphism
public class UniversityEnrollmentSystem {
    // Method to print details of a Person
    public static void printDetails(Person p) {
        p.displayInfo(); // Calls the appropriate displayInfo method
    }

    public static void main(String[] args) {
        // Creating two exanmple Student objects
        Student student1 = new Student("Mark Laurenciano", 20, "2310000", "Computer Engineering", 25);
        Student student2 = new Student("Sofia Smith", 22, "2310001", "Computer Engineering", 25);

        // Creating two example Instructor objects
        Instructor instructor1 = new Instructor("Arch. Hadid", 45, "CEA - 001000", "College of Engineering and Architecture", 40000);
        Instructor instructor2 = new Instructor("Engr. Bargo", 28, "CEA - 001001", "College of Engineering and Architecture", 35000);

        //Print information for each person
        System.out.println("Student Details:");
        printDetails(student1);
        System.out.println();
        printDetails(student2);
        System.out.println();
        
        System.out.println("Instructor Details:");
        printDetails(instructor1);
        System.out.println();
        printDetails(instructor2);
        System.out.println();
    }
}

