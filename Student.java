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
            System.out.println("3. Exit");
            System.out.print("Enter Choice : ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

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

                    System.out.println("Student Added Successfully!");
                    break;

                case 2:

                    if (students.isEmpty()) {
                        System.out.println("No Students Found!");
                    } else {

                        for (String studentId : students.keySet()) {

                            HashMap<String, String> s = students.get(studentId);

                            System.out.println("----------------------------");
                            System.out.println("Student ID : " + studentId);
                            System.out.println("Name : " + s.get("Name"));
                            System.out.println("Department : " + s.get("Department"));
                            System.out.println("Year : " + s.get("Year"));
                            System.out.println("Email : " + s.get("Email"));
                            System.out.println("----------------------------");
                        }
                    }

                    break;

                case 3:

                    System.out.println("Thank You!");
                    break;

                default:

                    System.out.println("Invalid Choice!");

            }

        } while (choice != 3);

        sc.close();
    }
}