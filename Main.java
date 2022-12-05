package Project_Portfolio;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        // Initialize variables
        int class_size;
        int i = 0;
        String name;
        String address;
        double gpa;

        // Instantiate objects
        Scanner user_input = new Scanner(System.in);
        LinkedList<Student> student_data = new LinkedList<Student>();
        Name_Comparator compare_name = new Name_Comparator();

        // Get class size for linked list
        System.out.print("\nEnter class size: ");
        class_size = user_input.nextInt();
        
        // Readability
        System.out.println();

        // Main loop
        while (i < class_size) {

            // Get student data 
            try {

                System.out.print("Enter Student Name: ");
                name = user_input.nextLine();
                name = user_input.nextLine();

                System.out.print("Enter Student Address: ");
                address = user_input.nextLine();

                System.out.print("Enter Student GPA: ");
                gpa = user_input.nextDouble();
                
                // Add data into object, add object into list 
                student_data.add(new Student(name, address, gpa));

                // Iterate i
                i++;
    
            } 
            
            // Catch user input error
            catch (InputMismatchException e) {
                System.out.println("Invalid Entry. Try Again.");
            }

            // Readability
            System.out.println();

        }

        // Scanner close
        user_input.close();

        // Student data sort by name
        student_data.sort(compare_name);

        // File Output Instantiations output 
        FileOutputStream file_stream = new FileOutputStream("student_data.txt");
        PrintWriter file_write = new PrintWriter(file_stream);

        // File write
        file_write.print("\tName\t\tAddress\t\t\t\tGPA\n");
        for (Student student : student_data) {
            file_write.println(student_data.indexOf(student) + student.print());
        }

        // Writer close
        file_write.close();

    }

}