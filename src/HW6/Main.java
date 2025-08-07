package HW6;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();

        students.add(new Student("Иван Иванов", "Группа А", 1, Map.of("Математика", 4, "Физика", 3, "Информатика", 5)));
        students.add(new Student("Петр Петров", "Группа Б", 2, Map.of("Математика", 2, "Физика", 2, "Информатика", 3)));
        students.add(new Student("Светлана Смирнова", "Группа А", 1, Map.of("Математика", 5, "Физика", 5, "Информатика", 4)));
        students.add(new Student("Алексей Кузнецов", "Группа В", 3, Map.of("Математика", 3, "Физика", 4, "Информатика", 3)));

        removeStudentsWithLowAverage(students);

        promoteStudents(students);

//        System.out.println("Студенты на курсе:");

        promoteStudents(students);
        printStudents(students, 2);
    }

    public static void removeStudentsWithLowAverage(Set<Student> students) {
        students.removeIf(student -> student.getAverageScore() < 3);
    }

    public static void promoteStudents(Set<Student> students) {
        for (Student student : students) {
            if (student.getAverageScore() >= 3) {
                student.nextCourse();
            }
        }
    }

    public static void printStudents(Set<Student> students, int course) {
        for (Student student : students) {
            if (student.getCourse() == course + 1) {
                System.out.println(student.getName());
            }
        }
    }
}



