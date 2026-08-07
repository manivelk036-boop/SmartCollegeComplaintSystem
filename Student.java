import java.util.HashMap;
import java.util.Scanner;

public class Student {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<String, HashMap<String, String>> students = new HashMap<>();
        HashMap<String, HashMap<String, String>> complaints = new HashMap<>();
        int choice;

        do {

           System.out.println("\n==================================");
System.out.println(" SMART COLLEGE COMPLAINT SYSTEM");
System.out.println("==================================");

System.out.println("\n----- Student Module -----");
System.out.println("1. Add Student");
System.out.println("2. Display Students");
System.out.println("3. Search Student");
System.out.println("4. Delete Student");
System.out.println("5. Update Student");

System.out.println("\n----- Complaint Module -----");
System.out.println("6. Register Complaint");
System.out.println("7. Display Complaints");

System.out.println("\n8. Exit");

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

    System.out.println("\nStudent Added Successfully!");

    break;
            
            case 2:

    if (students.isEmpty()) {

        System.out.println("\nNo Students Found!");

    } else {

        System.out.println("\n========== STUDENT LIST ==========");

        for (String studentId : students.keySet()) {

            HashMap<String, String> s = students.get(studentId);

            System.out.println("----------------------------------");
            System.out.println("Student ID : " + studentId);
            System.out.println("Name       : " + s.get("Name"));
            System.out.println("Department : " + s.get("Department"));
            System.out.println("Year       : " + s.get("Year"));
            System.out.println("Email      : " + s.get("Email"));
            System.out.println("----------------------------------");
        }
    }

    break;
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
        System.out.println("Password   : " + s.get("Password"));
        System.out.println("----------------------------");

    } else {

        System.out.println("Student Not Found!");

    }

    break;

    case 4:

    System.out.print("Enter Student ID to Delete : ");
    String deleteId = sc.nextLine();

    if (students.containsKey(deleteId)) {

        students.remove(deleteId);

        System.out.println("\nStudent Deleted Successfully!");

    } else {

        System.out.println("Student Not Found!");

    }

    break;
case 5:

    System.out.print("Enter Student ID to Update : ");
    String updateId = sc.nextLine();

    if (students.containsKey(updateId)) {

        HashMap<String, String> s = students.get(updateId);

        System.out.print("Enter New Name : ");
        s.put("Name", sc.nextLine());

        System.out.print("Enter New Department : ");
        s.put("Department", sc.nextLine());

        System.out.print("Enter New Year : ");
        s.put("Year", sc.nextLine());

        System.out.print("Enter New Email : ");
        s.put("Email", sc.nextLine());

        System.out.print("Enter New Password : ");
        s.put("Password", sc.nextLine());

        System.out.println("\nStudent Updated Successfully!");

    } else {

        System.out.println("Student Not Found!");

    }

    break;
case 6:

    System.out.print("Complaint ID : ");
    String complaintId = sc.nextLine();

    if (complaints.containsKey(complaintId)) {
        System.out.println("Complaint ID Already Exists!");
        break;
    }

    HashMap<String, String> complaint = new HashMap<>();

    System.out.print("Student ID : ");
    complaint.put("Student ID", sc.nextLine());

    System.out.print("Complaint Title : ");
    complaint.put("Title", sc.nextLine());

    System.out.print("Description : ");
    complaint.put("Description", sc.nextLine());

    System.out.print("Category : ");
    complaint.put("Category", sc.nextLine());

    complaint.put("Status", "Pending");

    complaints.put(complaintId, complaint);

    System.out.println("\nComplaint Registered Successfully!");

    break;

case 7:

    if (complaints.isEmpty()) {

        System.out.println("\nNo Complaints Found!");

    } else {

        System.out.println("\n========== COMPLAINT LIST ==========");

        for (String complainId : complaints.keySet()) {

            HashMap<String, String> c = complaints.get(complainId);

            System.out.println("-----------------------------------");
            System.out.println("Complaint ID : " + complainId);
            System.out.println("Student ID   : " + c.get("Student ID"));
            System.out.println("Title        : " + c.get("Title"));
            System.out.println("Description  : " + c.get("Description"));
            System.out.println("Category     : " + c.get("Category"));
            System.out.println("Status       : " + c.get("Status"));
            System.out.println("-----------------------------------");
        }
    }

    break;
    case 8:
    System.out.println("Thank You!");
    break;

default:

    System.out.println("Invalid Choice!");
                }

        } while (choice != 8);

        sc.close();
    }
}