package task2;

public class Task3 {
    public static void main(String[] args) {
        Student stud1 = new Student();
        stud1.setName("Ana");
        stud1.setGrade(10);

        Student stud2 = new Student();
        stud2.setName("Ana");
        stud2.setGrade(10);

        Student stud3 = stud1;

        if (stud1.equals(stud2))
            System.out.println("Same data");

        if (stud1.equals(stud1))
            System.out.println("Same data zone");

        if (stud1.equals(stud3))
            System.out.println("Just testing equals()");
    }
}
