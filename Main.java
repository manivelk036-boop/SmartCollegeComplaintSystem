import java.util.Scanner;

public class Main{

    static String[] studentIds = new String[100];
    static String[] names = new String[100];
    static String[] departments = new String[100];
    static int[] years = new int[100];
    static String[] emails = new String[100];
    static String[] passwords = new String[100];

    static int count = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {

            System.out.println("\n==================================");
            System.out.println(" SMART COLLEGE COMPLAINT SYSTEM");
            System.out.println("==================================");
            System.out.println("1. Create Student");
            System.out.println("2. Delete Student");
            System.out.println("3. Display Students");
            System.out.println("4. Exit");
            System.out.print("Enter Choice : ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Student ID : ");
                    studentIds[count] = sc.nextLine();

                    System.out.print("Name : ");
                    names[count] = sc.nextLine();

                    System.out.print("Department : ");
                    departments[count] = sc.nextLine();

                    System.out.print("Year : ");
                    years[count] = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Email : ");
                    emails[count] = sc.nextLine();

                    System.out.print("Password : ");
                    passwords[count] = sc.nextLine();

                    count++;

                    System.out.println("\nStudent Created Successfully!");
                    break;

                case 2:

                    System.out.print("Enter Student ID to Delete : ");
                    String deleteId = sc.nextLine();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {

                        if (studentIds[i].equals(deleteId)) {

                            for (int j = i; j < count - 1; j++) {
                                studentIds[j] = studentIds[j + 1];
                                names[j] = names[j + 1];
                                departments[j] = departments[j + 1];
                                years[j] = years[j + 1];
                                emails[j] = emails[j + 1];
                                passwords[j] = passwords[j + 1];
                            }

                            count--;
                            found = true;

                            System.out.println("Student Deleted Successfully!");
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student Not Found!");
                    }

                    break;

                case 3:

                    if (count == 0) {
                        System.out.println("No Students Available!");
                    } else {

                        System.out.println("\n----- Student Details -----");

                        for (int i = 0; i < count; i++) {

                            System.out.println("Student ID : " + studentIds[i]);
                            System.out.println("Name       : " + names[i]);
                            System.out.println("Department : " + departments[i]);
                            System.out.println("Year       : " + years[i]);
                            System.out.println("Email      : " + emails[i]);
                            System.out.println("--------------------------------");
                        }
                    }

                    break;

                case 4:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");

            }

        } while (choice != 4);

        sc.close();
    }
}