package assignment;

import java.util.HashMap;
import java.util.Map;

public class Student {
    private String name;
    private Map<String, Double> scores;

    public Student(String name) {
        this.name = name;
        this.scores = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void setScore(String subject, double score) {
        scores.put(subject, score);
    }

    public double getAverageScore() {
        double sum = scores.values().stream().mapToDouble(Double::doubleValue).sum();
        return scores.isEmpty() ? 0 : sum / scores.size();
    }

    public double getHighestScore() {
        return scores.values().stream().mapToDouble(Double::doubleValue).max().orElse(0);
    }

    public Map<String, Double> getScores() {
        return scores;
    }

}
