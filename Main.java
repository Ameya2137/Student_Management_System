//Name: Ameya Tipnis
//PRN: 23070126012
//Batch: 2023-27 (A1)

// Main.java
import java.util.*; // Importing Java utilities

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Creating a scanner object for user input
        StudentOperations operations = new StudentOperations(); // Creating an instance of StudentOperations to manage student records
        int choice;

        // Creating a do-while loop
        do {
            // Displaying menu options
            System.out.println("\nMenu:\n1. Add Student\n2. Display Student(s)\n3. Search by PRN\n4. Search by Name\n5. Search by Position (Index)\n6. Update Student\n7. Delete Student\n8. Exit");
            System.out.print("Enter your choice: "); 
            choice = scan.nextInt(); // Taking user choice as input
            scan.nextLine();

            // Creating a switch case
            switch (choice) { 
                case 1:
                    // Adding a new student
                    System.out.print("Enter Name: ");
                    String name = scan.nextLine();
                    System.out.print("Enter PRN: ");
                    int prn = scan.nextInt();
                    scan.nextLine();
                    System.out.print("Enter Branch: ");
                    String branch = scan.nextLine();
                    System.out.print("Enter Batch: ");
                    String batch = scan.nextLine();
                    System.out.print("Enter CGPA: ");
                    float cgpa = scan.nextFloat();
                    scan.nextLine();
                    operations.addStudent(new Student(name, prn, branch, batch, cgpa)); // Adding student to list
                    break;
                case 2:
                    // Displaying all students
                    operations.displayStudents();
                    break;
                case 3:
                    // Searching student by PRN
                    System.out.print("Enter PRN to search: ");
                    prn = scan.nextInt();
                    scan.nextLine();
                    Student student = operations.searchByPRN(prn); // Searches for the student's PRN
                    if (student != null) student.display();
                    else System.out.println("Student not found.");
                    break;
                case 4:
                    // Searching student by Name
                    System.out.print("Enter Name to search: ");
                    name = scan.nextLine();
                    student = operations.searchByName(name); // Searches for the student's name
                    if (student != null) student.display();
                    else System.out.println("Student not found.");
                    break;
                
