import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("\n--- STUDENT GRADE TRACKER ---");
            System.out.println("1. Add Student");
            System.out.println("2. Show All Students + Summary");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            if (choice == 1) {

                System.out.print("Enter Name: ");
                String name = sc.next();

                System.out.print("Enter Roll No: ");
                int roll = sc.nextInt();

                System.out.print("Enter Marks: ");
                int marks = sc.nextInt();

                students.add(new Student(name, roll, marks));
                System.out.println("Student Added!");

            }

            else if (choice == 2) {

                if (students.isEmpty()) {
                    System.out.println("No students found!");
                } else {

                    int total = 0;
                    int highest = students.get(0).marks;
                    int lowest = students.get(0).marks;

                    System.out.println("\n--- STUDENT LIST ---");

                    for (Student s : students) {
                        System.out.println("Name: " + s.name +
                                ", Roll No: " + s.rollNo +
                                ", Marks: " + s.marks);

                        total += s.marks;

                        if (s.marks > highest) highest = s.marks;
                        if (s.marks < lowest) lowest = s.marks;
                    }

                    double average = (double) total / students.size();

                    System.out.println("\n--- SUMMARY ---");
                    System.out.println("Average Marks: " + average);
                    System.out.println("Highest Marks: " + highest);
                    System.out.println("Lowest Marks: " + lowest);
                }
            }

            else if (choice == 3) {
                System.out.println("Exiting...");
                break;
            }

            else {
                System.out.println("Invalid Choice!");
            }
        }

        sc.close();
    }
}