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
                case 5:
                    // Searches for a student by position i.e index in the arraylist
                    System.out.print("Enter Position (Index) to search: ");
                    int position = scan.nextInt();
                    scan.nextLine();
                    student = operations.searchByPosition(position); // Searches for the student's position in the arraylist
                    if (student != null) student.display();
                    else System.out.println("Invalid position.");
                    break;
                case 6:
                    // Finds a student by PRN and updates their details.
                    System.out.print("Enter PRN of student to update: ");
                    prn = scan.nextInt();
                    scan.nextLine();
                    System.out.print("Enter New Name: ");
                    name = scan.nextLine();
                    System.out.print("Enter New Branch: ");
                    branch = scan.nextLine();
                    System.out.print("Enter New Batch: ");
                    batch = scan.nextLine();
                    System.out.print("Enter New CGPA: ");
                    cgpa = scan.nextFloat();
                    scan.nextLine();
                    if (operations.updateStudent(prn, name, branch, batch, cgpa)) // Calls updateStudent(prn, name, branch, batch, cgpa) that has been declared in StudentOperations.java
                        System.out.println("Student updated successfully.");
                    else
                        System.out.println("Student not found.");
                    break;
                case 7:
                    // Finds a student by PRN and deletes them
                    System.out.print("Enter PRN of student to delete: ");
                    prn = scan.nextInt();
                    scan.nextLine();
                    if (operations.deleteStudent(prn)) // Calls deleteStudent(prn) that has been declared in StudentOperations.java
                        System.out.println("Student deleted successfully.");
                    else
                        System.out.println("Student not found.");
                    break;
                case 8:
                    // Prints "Exiting..." and terminates the loop.
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again."); // If the user does choose a number between 1-8, the following error message is returned
            }
        } while (choice != 8); // Repeats the menu until the user selects 8 ,i.e. until the user selects Exit option
    }
}
                
