import java.util.HashMap;
import java.util.Scanner;

public class Student {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<String, HashMap<String, String>> students = new HashMap<>();

        int choice;

        do {

            System.out.println("\n==================================");
            System.out.println(" SMART COLLEGE COMPLAINT SYSTEM");
            System.out.println("==================================");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter Choice : ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                // Add Student
                case 1:

                    System.out.print("Student ID : ");
                    String id = sc.nextLine();

                    if (students.containsKey(id)) {
                        System.out.println("Student ID Already Exists!");
                        break;
                    }

                    HashMap<String, String> student = new HashMap<>();

                    System.out.print("Name : ");
                    student.put("Name", sc.nextLine());

                    System.out.print("Department : ");
                    student.put("Department", sc.nextLine());

                    System.out.print("Year : ");
                    student.put("Year", sc.nextLine());

                    System.out.print("Email : ");
                    student.put("Email", sc.nextLine());

                    System.out.print("Password : ");
                    student.put("Password", sc.nextLine());

                    students.put(id, student);

                    System.out.println("\nStudent Added Successfully!");

                    break;

                // Display Students
                case 2:

                    if (students.isEmpty()) {
                        System.out.println("\nNo Students Found!");
                    } else {

                        System.out.println("\n========== STUDENT LIST ==========");

                        for (String studentId : students.keySet()) {

                            HashMap<String, String> s = students.get(studentId);

                            System.out.println("--------------------------------");
                            System.out.println("Student ID : " + studentId);
                            System.out.println("Name       : " + s.get("Name"));
                            System.out.println("Department : " + s.get("Department"));
                            System.out.println("Year       : " + s.get("Year"));
                            System.out.println("Email      : " + s.get("Email"));
                            System.out.println("--------------------------------");
                        }
                    }

                    break;

                // Search Student
                case 3:

                    System.out.print("Enter Student ID to Search : ");
                    String searchId = sc.nextLine();

                    if (students.containsKey(searchId)) {

                        HashMap<String, String> s = students.get(searchId);

                        System.out.println("\n===== STUDENT DETAILS =====");
                        System.out.println("Student ID : " + searchId);
                        System.out.println("Name       : " + s.get("Name"));
                        System.out.println("Department : " + s.get("Department"));
                        System.out.println("Year       : " + s.get("Year"));
                        System.out.println("Email      : " + s.get("Email"));

                    } else {

                        System.out.println("Student Not Found!");
                    }

                    break;

                // Delete Student
                case 4:

                    System.out.print("Enter Student ID to Delete : ");
                    String deleteId = sc.nextLine();

                    if (students.containsKey(deleteId)) {

                        students.remove(deleteId);

                        System.out.println("Student Deleted Successfully!");

                    } else {

                        System.out.println("Student Not Found!");
                    }

                    break;

                // Exit
                case 5:

                    System.out.println("Thank You!");
                    break;

                default:

                    System.out.println("Invalid Choice!");

            }

        } while (choice != 5);

        sc.close();
    }
}