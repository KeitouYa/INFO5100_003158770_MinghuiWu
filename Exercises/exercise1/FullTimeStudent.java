package exercise1;

import java.util.ArrayList;
import java.util.List;

//Derived class for Full-Time students
public class FullTimeStudent extends Student{
    protected static final int TOTAL_EXAM = 2;
    protected List<Double> examScores;

    public FullTimeStudent(String name) {
        super(name);
        this.examScores = new ArrayList<>();
    }

    public List<Double> getExamScores() {
        return examScores;
    }

    public void setExamScores(List<Double> examScores) {
        this.examScores = examScores;
    }

    public double getSingleExamScore(int examNumber){
        if(examNumber >= 0 && examNumber < TOTAL_EXAM){
            return examScores.get(examNumber);
        }

        return -1;
    }

    public void setSingleExamScore(int examNumber, double score){
        if(examNumber >= 0 && examNumber < TOTAL_EXAM){
            examScores.set(examNumber, score);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("FullTimeStudent {");
        sb.append("name = " + name + ", ");
        sb.append("examScores=[");
        for(int i = 0; i <TOTAL_EXAM; i++){
            sb.append("exam" + (i + 1) + " = " + examScores.get(i));
            if(i < TOTAL_EXAM - 1){
                sb.append(", ");
            }
        }

        sb.append("]}");

        return sb.toString();
    }
}
