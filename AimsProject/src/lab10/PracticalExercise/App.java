package lab10.PracticalExercise;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Student student = new Student();

        System.out.print("studentID: ");
        student.setStudentID(input.nextInt());

        System.out.print("studentName: ");
        input.nextLine();
        student.setStudentName(input.nextLine());

        System.out.print("birthday: ");
        student.setBirthday(input.nextLine());

        System.out.print("gpa: ");
        student.setGpa(input.nextFloat());

        input.close();

        System.out.println(student.toString());
    }
}
