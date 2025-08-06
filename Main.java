import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Student> studentList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n--- Student Record Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: addStudent(); break;
                case 2: viewStudents(); break;
                case 3: updateStudent(); break;
                case 4: deleteStudent(); break;
                case 5: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice!");
            }
        } while (choice != 5);
    }

    public static void addStudent() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        for (Student s : studentList) {
        if (s.getId() == id) {
            System.out.println("Student with ID " + id + " already exists. Cannot add duplicate.");
            return;
        }
      }

        sc.nextLine(); // consume newline
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();
        Student student = new Student(id, name, marks);
        studentList.add(student);
        System.out.println("Student added successfully!");
    }

    public static void viewStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        for (Student s : studentList) {
            System.out.println(s);
        }
    }

    public static void updateStudent() {
        System.out.print("Enter ID to update: ");
        int id = sc.nextInt();
        for (Student s : studentList) {
            if (s.getId() == id) {
                sc.nextLine();
                System.out.print("Enter new Name: ");
                s.setName(sc.nextLine());
                System.out.print("Enter new Marks: ");
                s.setMarks(sc.nextDouble());
                System.out.println("Student updated.");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public static void deleteStudent() {
        System.out.print("Enter ID to delete: ");
        int id = sc.nextInt();
        for (Student s : studentList) {
            if (s.getId() == id) {
                studentList.remove(s);
                System.out.println("Student deleted.");
                return;
            }
        }
        System.out.println("Student not found.");
    }
}
