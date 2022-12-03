import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Register {
    private Student student = new Student();
    static ArrayList<Course> CourseList;

    public void takeDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        student.setName(sc.nextLine());
        System.out.println("Enter your BITS ID: ");
        student.setBitsId(sc.nextLine());
        System.out.println("Enter you CGPA: ");
        student.setCGPA(sc.nextFloat());
        Course course = new Course();
        System.out.println("Enter the number of courses you have: ");
        int n = sc.nextInt();
        for(int i = 0;i<n;i++) {
            System.out.println("Course: " + String.valueOf(i));
            course.toAddNewCourse(sc);
            CourseList.add(course);
        }
        try{
            FileWriter obj = new FileWriter("Data.txt");
        }



    }
}
