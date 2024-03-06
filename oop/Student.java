package oop;

public class Student {
     //Field/Properties

    // Static variable doesnot neet object to call it but instance variable needs object to call it.

    static int studentCount;

    Integer rollNumber;
    String fullName;
    String address;
    String email;
    Integer age;


    //Default Constructor

    public Student(){
        studentCount++;

    }



    //Parameterized constructor
    public Student(Integer rollNumber1, String fullName1, String address, String email, Integer age){
        this.rollNumber = rollNumber1;
        this.fullName = fullName1;
        this.address = address;
        this.email = email;
        this.age = age;
        studentCount++;
    }
    //Methods/Behaviors

    // Default constructor which have to be created by ourselves if we have created parameterized constructor.

    public void displayDetails(){
        System.out.println("Full name is: " +this.fullName);
        System.out.println("Roll number is: "+this.rollNumber);
        System.out.println("Address is: "+this.address);
        System.out.println("Email is: "+this.email);
        System.out.println("Age is: "+this.age);

    }

    static void getNoOfStudents(){
        System.out.println("Number of Students: "+Student.studentCount);
    }

    public void checkIfStudentIsPassed(){
        System.out.println(this);

    }

    public static void main(String[] args) {
        //Object creation
        //Class_name object_name = new class_name();

        // Parameterized Constructor.
        Student student = new Student(1, "Meshach Sherpa", "Virginia", "meshach@gmail.com", 30); // Constructor

        Student student1 = new Student(); //Default constructor
        student1.rollNumber = 1;
        student1.fullName = "Mathew";
        student1.address = "Washington DC";
        student1.email = "mathew@hotmail.com";
        student1.age = 30;


        //object_name.field_name.
        /*System.out.println("Full name is: " +student.fullName);
        System.out.println("Roll number is: "+student.rollNumber);
        System.out.println("Address is: "+student.address);
        System.out.println("Email is: "+student.email);
        System.out.println("Age is: "+student.age);*/

        //object_name.method_name
        //student.displayDetails();
        student1.displayDetails();

        Student.getNoOfStudents();


    }
}
