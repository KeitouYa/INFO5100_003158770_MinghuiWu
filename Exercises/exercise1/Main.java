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
        return min + Math.random() * (max - min);
    }

    private static List<Student> initialAllStudents(List<Student> students){
        for(int i = 0; i < 20; i++){
            if(i < 10){
                PartTimeStudent pt = new PartTimeStudent("PartTimeStudent" + (i + 1));
                List<Double> quizScores = new ArrayList<>();
                for(int j = 0; j < 15; j++) {
                    quizScores.add(randomDouble(60, 100));
                }
                pt.setQuizScores(quizScores);
                students.add(pt);
            }else{
                FullTimeStudent ft = new FullTimeStudent("FullTimeStudent" + (i - 10 + 1));
                List<Double> quizScores = new ArrayList<>();
                List<Double> examScores = new ArrayList<>();
                for(int j = 0; j < 15; j++) {
                    quizScores.add(randomDouble(60, 100));
                }
                for(int k = 0; k < 2; k++){
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
