// StudentOperations.java
import java.util.*; // Importing Scanner, ArrayList, and other utility classes

class StudentOperations { // Defining a StudentOperations class that manages a list of students and operations like add, search, update, and delete
    private ArrayList<Student> students; // Declaring a private list that stores Student objects directly

    public StudentOperations() { this.students = new ArrayList<>(); } // Constructor that initializes an empty student list

    public void addStudent(Student student) { students.add(student); } // Adds an object to the list

    public void displayStudents() {
        for (Student student : students) { student.display(); } // Iterates through all objects and prints the student details
    }

    public Student searchByPRN(int prn) {
        for (Student student : students) {
            if (student.getPRN() == prn) return student; // Loops through the list and finds the entered student PRN
        }
        return null; // Returns null if not found
    }

    public Student searchByName(String name) {
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) return student; // Loops through the list and finds the entered student name (case-insensitive)
        }
        return null; // Returns null if not found
    }

    public Student searchByPosition(int position) {
        if (position >= 0 && position < students.size()) return students.get(position); //Checks if position is within valid index range 
        return null;
    }

    public boolean updateStudent(int prn, String name, String branch, String batch, float cgpa) {
        Student student = searchByPRN(prn); // Finds the student by their PRN
        if (student != null) { // If found, then updates their details by setter methods declared in Student.java
            student.setName(name);
            student.setBranch(branch);
            student.setBatch(batch);
            student.setCGPA(cgpa);
            return true;
        }
        return false;
    }
}
