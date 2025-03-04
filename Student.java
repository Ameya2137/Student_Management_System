// Student.java
class Student { // Defining a class named Student
    // Defining the attributes or instance variables of Student
    private String name;
    private int prn;
    private String branch;
    private String batch;
    private float cgpa;

    // Defining a constructor that initializes a Student object with the given values
    public Student(String name, int prn, String branch, String batch, float cgpa) {
        // this.variablename is used to assign parameter values to instance variables
        this.name = name;
        this.prn = prn;
        this.branch = branch;
        this.batch = batch;
        this.cgpa = cgpa;
    }
}
