package StreamsAndLambdas;

import java.util.*;
import java.util.stream.Collectors;

class Student {
    String name;
    String subject;
    int marks;

    Student(String name, String subject, int marks) {
        this.name = name;
        this.subject = subject;
        this.marks = marks;
    }

    public String toString() {
        return name + " (" + subject + "): " + marks;
    }
}

public class StudentStreamExercise {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Raj", "Math", 80),
                new Student("Anita", "Science", 72),
                new Student("Vikram", "Math", 60),
                new Student("Sneha", "Science", 90),
                new Student("Amit", "English", 85)
        );

        // Task 1: Students with marks > 75

        List<Student> studentsStream = students.stream()
                .filter(student -> student.marks >75)
                .collect(Collectors.toList());

        System.out.println(studentsStream);

        // Task 2: Student names in uppercase
        List<String> studentsStream1 = students.stream()
                .map(student -> student.name.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(studentsStream1);
        // Task 3: Total marks
        int totalMarks = students.stream()
                .map(student -> student.marks)
                .reduce(0, (a, b) -> a + b);
        System.out.println(totalMarks);

        // Task 4: Group students by subject

          Map<String, List<Student>> studentsByGroup = students.stream()
                .collect(Collectors.groupingBy(student -> student.subject));
        System.out.println(studentsByGroup);
    }
}
