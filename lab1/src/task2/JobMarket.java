package task2;

import java.util.ArrayList;
import java.util.List;

public class JobMarket {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        Student stud = new Student();
        stud.setName("Gigel");
        stud.setGrade(10);
        students.add(0, stud);

        stud = new Student();
        stud.setName("Dorel");
        stud.setGrade(7);
        students.add(1, stud);

        stud = new Student();
        stud.setName("Marcel");
        stud.setGrade(9);
        students.add(2, stud);

        stud = new Student();
        stud.setName("Ionel");
        stud.setGrade(5);
        students.add(3, stud);

        Internship google = new Internship();
        google.setName("Google");
        google.setMinGrade("8");
        google.setStudents(students);
        google.chooseCandidatesForInterview();

        Internship amazon = new Internship();
        amazon.setName("Amazon");
        amazon.setMinGrade("10");
        amazon.setStudents(students);
        amazon.chooseCandidatesForInterview();

        Internship facebook = new Internship();
        facebook.setName("Facebook");
        facebook.setMinGrade("7");
        facebook.setStudents(students);
        facebook.chooseCandidatesForInterview();

        Internship microsoft = new Internship();
        microsoft.setName("Microsoft");
        microsoft.setMinGrade("9");
        microsoft.setStudents(students);
        microsoft.chooseCandidatesForInterview();
    }

}
