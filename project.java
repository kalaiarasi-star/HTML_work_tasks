import java.util.*;

class Student {
    String name;
    int id;
    static String collegeName = "Prince Dr. K Vasudevan Engineering College of Technology";
    String dept;
    int age;

    Student() {}

    Student(String name, int id, String dept, int age) {
        this.name = name;
        this.id = id;
        this.dept = dept;
        this.age = age;
    }

    void show() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("College Name: " + collegeName); // auto-printed
        System.out.println("Department: " + dept);
        System.out.println("Age: " + age);
        System.out.println();
    }
}

public class project {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Student Information Database");
        System.out.print("Enter the number of students: ");
        int n = scan.nextInt();
        scan.nextLine();

        Student[] s1 = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the student details: " + (i + 1));

            System.out.print("Name: ");
            String name = scan.nextLine();

            System.out.print("ID: ");
            int id = scan.nextInt();
            scan.nextLine();

            System.out.print("Department: ");
            String dept = scan.nextLine();

            System.out.print("Age: ");
            int age = scan.nextInt();
            scan.nextLine();

            System.out.println();

            s1[i] = new Student(name, id, dept, age);
        }

        for (int i = 0; i < n; i++) {
            s1[i].show();
        }
    }
}