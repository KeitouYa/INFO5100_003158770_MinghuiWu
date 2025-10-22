package exercise1;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Session session = new Session();
        //initialize 20 students
        List<Student> students = initialAllStudents(session.getStudents());

        session.calculateAverageQuizScores();
        session.printQuizScoresAscending();
        session.printNamesOfPartTimeStudents();
        session.printExamScoresOfFullTimeStudents();

        System.out.println("All methods executed successfully!");
    }


    public static double randomDouble(double min, double max){
       double value =  min + Math.random() * (max - min);
        //Round to two decimal places
       return Math.round(value * 100.0) / 100.0;
    }


    private static List<Student> initialAllStudents(List<Student> students){
        for(int i = 0; i < Session.TOTAL_STUDENT_NUMBER; i++){
            // To clarify why I use this condition
            // The expression (Session.TOTAL_STUDENT_NUMBER / 2) performs integer division,
            // meaning any decimal part will be discarded.
            // Therefore, when the total number of students is even, both groups (part-time and full-time)
            // will have the same number of students.
            // When the total number is odd, the part-time group will have one fewer student
            // than the full-time group.
            if(i < (Session.TOTAL_STUDENT_NUMBER / 2)){
                //To clarify:
                // The student names below (e.g., "PartTimeStudent1", "PartTimeStudent2", etc.) are auto-generated for testing and demonstration purposes only.
                // In a real-world scenario, each student would have a unique, meaningful name (e.g., retrieved from a database or user input).
                // To make it clearer in this exercise, I used auto-generated names.
                PartTimeStudent pt = new PartTimeStudent("PartTimeStudent" + (i + 1));
                List<Double> quizScores = new ArrayList<>();
                for(int j = 0; j < Student.TOTAL_QUIZZES; j++) {
                    quizScores.add(randomDouble(60, 100));
                }
                pt.setQuizScores(quizScores);
                students.add(pt);
            }else{
                FullTimeStudent ft = new FullTimeStudent("FullTimeStudent" + (i - 10 + 1));
                List<Double> quizScores = new ArrayList<>();
                List<Double> examScores = new ArrayList<>();
                for(int j = 0; j < Student.TOTAL_QUIZZES; j++) {
                    quizScores.add(randomDouble(60, 100));
                }
                for(int k = 0; k < FullTimeStudent.TOTAL_EXAM; k++){
                    examScores.add(randomDouble(60, 100));
                }

                ft.setQuizScores(quizScores);
                ft.setExamScores(examScores);
                students.add(ft);
            }
        }

        return students;
    }
}
