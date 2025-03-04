// StudentOperations.java
import java.util.*; // Importing Scanner, ArrayList, and other utility classes

class StudentOperations { // Defining a StudentOperations class that manages a list of students and operations like add, search, update, and delete
    private ArrayList<Student> students; // Declaring a private list that stores Student objects directly

    public StudentOperations() { this.students = new ArrayList<>(); } // Constructor that initializes an empty student list

    public void addStudent(Student student) { students.add(student); } // Adds an object to the list

    public void displayStudents() {
        for (Student student : students) { student.display(); } // Iterates through all objects and prints the student details
    }
}
