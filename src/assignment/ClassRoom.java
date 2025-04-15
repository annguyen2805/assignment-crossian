package assignment;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ClassRoom implements IManagerStudent {
    private List<Student> students;
    private List<String> subjects;

    public ClassRoom() {
        students = new ArrayList<>();
        subjects = new ArrayList<>();
    }

    @Override
    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public void addSubject(String subject) {
        subjects.add(subject);
    }

    @Override
    public void displayScores() {
        System.out.println("\n=== Scoreboard ===");
        System.out.println("No.\tName\t" + String.join("\t", subjects) + "\tAverage Score");
        int index = 1;
        for (Student student : students) {
            System.out.print(index++ + "\t" + student.getName() + "\t");
            for (String subject : subjects) {
                System.out.print(student.getScores().getOrDefault(subject, 0.0) + "\t");
            }
            System.out.println(String.format("%.2f", student.getAverageScore()));
        }
    }

    @Override
    public void findTopStudents() {
        Optional<Student> topAverage = students.stream()
                .max(Comparator.comparingDouble(Student::getAverageScore));

        Optional<Student> topScore = students.stream()
                .max(Comparator.comparingDouble(Student::getHighestScore));

        topAverage.ifPresent(student ->
                System.out.println("\nStudent with the highest average score: "
                        + student.getName() + " with " + student.getAverageScore())
        );

        topScore.ifPresent(student ->
                System.out.println("Student with the highest individual subject score: "
                        + student.getName() + " with " + student.getHighestScore())
        );
    }

}
