package task2;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;

public class Internship {
    private String name;
    private String minGrade;
    private List<Student> students; // = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMinGrade() {
        return minGrade;
    }

    public void setMinGrade(String minGrade) {
        this.minGrade = minGrade;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Student chooseCandidateRandomly() {
        Random ran = new Random();
        int index = ran.nextInt(students.size());
        return students.get(index);
    }

    public void chooseCandidatesForInterview() {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getGrade() >= Double.parseDouble(minGrade))
                System.out.println("Candidate " + students.get(i).getName() + " got a phone interview at " + name);
        }
    }
}
