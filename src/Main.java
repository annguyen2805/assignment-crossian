import assignment.ClassRoom;
import assignment.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ClassRoom classroom = new ClassRoom();

        System.out.println("Enter the list of subjects (separated by commas):");
        String[] subjects = scanner.nextLine().split(",");
        for (String subject : subjects) {
            classroom.addSubject(subject.trim());
        }

        System.out.println("Enter the number of students:");
        int numStudents = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter the student's name:");
            String name = scanner.nextLine();
            Student student = new Student(name);

            for (String subject : subjects) {
                System.out.println("Enter the score for " + subject.trim() + ":");
                double score = scanner.nextDouble();
                student.setScore(subject.trim(), score);
            }
            scanner.nextLine();
            classroom.addStudent(student);
        }

        classroom.displayScores();
        classroom.findTopStudents();

    }
}