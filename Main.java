//Name: Ameya Tipnis
//PRN: 23070126012
//Batch: 2023-27 (A1)

// Main.java
import java.util.*; // Importing Scanner and ArrayList utilities

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Creating a scanner object for user input
        StudentOperations operations = new StudentOperations(); // Creating an instance of StudentOperations to manage student records
        int choice;

        do {
            // Displaying menu options
            System.out.println("\nMenu:\n1. Add Student\n2. Display Student(s)\n3. Search by PRN\n4. Search by Name\n5. Search by Position (Index)\n6. Update Student\n7. Delete Student\n8. Exit");
            System.out.print("Enter your choice: "); 
            choice = scan.nextInt(); // Taking user choice as input
            scan.nextLine();
