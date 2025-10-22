package exercise1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Session {
    static final int TOTAL_STUDENT_NUMBER = 20;
    List<Student> students;

    public Session(){
        students = new ArrayList<>();
    }

    public static int getTotalStudentNumber() {
        return TOTAL_STUDENT_NUMBER;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void calculateAverageQuizScores(){
        System.out.println("=== Average Quiz Scores Per Student ===");
        System.out.println("Student Name, Average score");
        for(Student student : students){
            System.out.print(student.getName() + ", ");
            System.out.printf("%.2f%n", student.getAverageQuizScore());
        }
        System.out.println();
    }

    public void printQuizScoresAscending(){
        List<Double> allQuizScores = new ArrayList<>();
        for(Student stu : students){
            allQuizScores.addAll(stu.getQuizScores());
        }

        Collections.sort(allQuizScores);

        System.out.println("=== All quiz scores in ascending order ===");
        System.out.println("(Note: Scores are displayed 10 per line for better readability.)");
        int count = 0;
        for(double score : allQuizScores){
            System.out.printf("%.2f ",score);
            count++;
            if(count % 10 == 0){
                System.out.println();
            }
        }
        System.out.println();
    }

    public void printNamesOfPartTimeStudents(){
        System.out.println("=== Part-Time Student Names ===");
        for(Student student : students){
            if(student instanceof PartTimeStudent){
                System.out.println(student.getName());
            }
        }

        System.out.println();
    }

    public void printExamScoresOfFullTimeStudents(){
        System.out.println("=== Full-Time Student Exam Scores ===");
        for(Student student : students){
            if(student instanceof FullTimeStudent){
                FullTimeStudent fullTimeStudent = (FullTimeStudent)student;
                System.out.println("Student: " + fullTimeStudent.getName());
                List<Double> fullTimeExamScores = fullTimeStudent.getExamScores();
                for(int i = 0; i < fullTimeExamScores.size(); i++){
                    System.out.printf("Exam" + (i + 1) + ": %.2f%n", fullTimeExamScores.get(i));
                }
                System.out.println();
            }
        }
    }
}
