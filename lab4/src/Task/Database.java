package Task;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Database {
    private final List<Student> students = new ArrayList<>();
    private final List<Teacher> teachers = new ArrayList<>();
    private static int numberOfInstances = 0;
    private static Database database = null;

    // TODO: make it Singleton
    private Database() {
        numberOfInstances++;
    }
    public static Database getDatabase() {
        if (database == null) {
            database = new Database();
        }
        return database;
    }

    public static int getNumberOfInstances() {
        return numberOfInstances;
    }

    public void addTeachers(List<Teacher> teachers) {
        this.teachers.addAll(teachers);
    }

    public void addStudents(List<Student> students) {
        this.students.addAll(students);
    }

    public List<Teacher> findTeachersBySubject(String subject) {
        List<Teacher> teachersList = new ArrayList<>();
        for (Teacher teach : teachers)
            if (teach.getSubjects().contains(subject))
                teachersList.add(new Teacher(teach));
        return teachersList;
    }

    public List<Student> findAllStudents() {
        return students;
    }

    public List<Teacher> findAllTeachers() {
        return teachers;
    }

    public List<Student> getStudentsBySubject(String subject) {
        List<Student> studentsList = new ArrayList<Student>();
        for (Student stud : students)
            if (stud.getSubjects().containsKey(subject))
                studentsList.add(new Student(stud));
        return studentsList;
    }

    public List<Student> getStudentsByAverageGrade() {
        List<Student> studentsList = new ArrayList<Student>();
        for (Student stud : students)
            studentsList.add(new Student(stud));

        studentsList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.averageGrade() < o2.averageGrade())
                    return -1;
                else if (o1.averageGrade() > o2.averageGrade())
                    return 1;
                return 0;
            }
        });

        return studentsList;
    }

    public List<Student> getStudentsByGradeForSubject(String subject) {
        List<Student> studentsList = new ArrayList<Student>();
        for (Student stud : students)
            if (stud.getSubjects().containsKey(subject))
                studentsList.add(new Student(stud));
        
        studentsList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getGradeForSubject(subject) < o2.getGradeForSubject(subject))
                    return -1;
                else if (o1.getGradeForSubject(subject) > o2.getGradeForSubject(subject))
                    return 1;
                return 0;
            }
        });

        return studentsList;
    }
}
