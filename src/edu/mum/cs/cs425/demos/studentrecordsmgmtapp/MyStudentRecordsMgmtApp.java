package edu.mum.cs.cs425.demos.studentrecordsmgmtapp;

import edu.mum.cs.cs425.demos.studentrecordsmgmtapp.model.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MyStudentRecordsMgmtApp {

    public static void main(String args[]) {
        List<Student> list = new ArrayList<Student>();
        list.add(new Student(110001, "Dave", LocalDate.of(1951, 11, 18)));
        list.add(new Student(110002, "Anna", LocalDate.of(1990, 12, 7)));
        list.add(new Student(110003, "Erica", LocalDate.of(1974, 1, 31)));
        list.add(new Student(110004, "Carlos", LocalDate.of(2009, 8, 22)));
        list.add(new Student(110005, "Bob", LocalDate.of(1990, 3, 5)));
        printListOfStudents(list);
        System.out.println("A student who gained admission into the University at least 30 years ago");
        getListOfPlatinumAlumniStudents(list);

        System.out.println("Array filter");
        printHelloWorld(new int[]{5, 7, 35});
    }

    public static void printListOfStudents(List<Student> students) {
        for (Student stu : students) {
            System.out.println(stu.toString());
        }
    }

    public static void getListOfPlatinumAlumniStudents(List<Student> students) {
        List<Student> result = students.stream()
                .filter(s -> s.calculateAge(s.getDateOfAdmission(), LocalDate.now()) >= 30)
                .sorted(Comparator.comparing(Student::getStudentName))
                .collect(Collectors.toList());
        result.forEach(System.out::println);
    }

    /*
     An array of integers and iterates through them, and it prints the text,
     "Hello", if the integer is a multiple of 5. It prints the text, "World",
     if the integer is a multiple of 7. And when it encounters an integer
     that is a multiple of both 5 and 7, it prints the text, "HelloWorld".
    */
    public static void printHelloWorld(int[] ints) {
        if(ints ==  null || ints.length ==0)
        {
            return;
        }
        for (int val : ints) {
            if (val % 5 == 0 && val % 7 == 0) {
                System.out.println("HelloWorld");
            } else if (val % 5 == 0) {
                System.out.println("Hello");
            } else if (val % 7 == 0)
                System.out.println("World");
            else {
                return;
            }
        }
    }
}
