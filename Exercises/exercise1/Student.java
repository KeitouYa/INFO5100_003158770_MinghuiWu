package exercise1;

import java.util.ArrayList;
import java.util.List;

public class Student {
    protected static final int TOTAL_QUIZZES = 15;
    protected String name;
    protected List<Double> quizScores;

    public Student(String name){
        this.name = name;
        this.quizScores = new ArrayList<Double>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Double> getQuizScores() {
        return quizScores;
    }

    public void setQuizScores(List<Double> quizScores) {
        this.quizScores = quizScores;
    }


    //Get and Set single quiz
    public double getSingleQuizScore(int quizNumber){
        if(quizNumber >= 0 && quizNumber < TOTAL_QUIZZES){
            return quizScores.get(quizNumber);
        }
        return -1;
    }

    public void setTotalQuizzes(int quizNumber, double score){
        if(quizNumber >= 0 && quizNumber < TOTAL_QUIZZES && (score >= 0 && score <= 100)){
            quizScores.set(quizNumber, score);
        }
    }


    public double getAverageQuizScore(){
        if(quizScores.isEmpty()){
            return 0.0;
        }

        double sum = 0;
        for(double score : quizScores){
            sum += (double) score;
        }

        return sum / TOTAL_QUIZZES;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='%s'" + name + '\'' +
                ", quizScores='%.2f" + quizScores +
                '}';
    }
}
