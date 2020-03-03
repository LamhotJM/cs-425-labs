package edu.mum.cs.cs425.demos.studentrecordsmgmtapp;

import edu.mum.cs.cs425.demos.studentrecordsmgmtapp.model.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MyStudentRecordsMgmtApp {

    public static void main(String args[]) {
        List<Student> list = new ArrayList<Student>();
        list.add(new Student(110001, "Dave", LocalDate.of(1951, 11, 18)));
        list.add(new Student(110002, "Anna", LocalDate.of(1990, 12, 7)));
        list.add(new Student(110003, "Erica", LocalDate.of(1974, 1, 31)));
        list.add(new Student(110004, "Carlos", LocalDate.of(2009, 8, 22)));
        list.add(new Student(110005, "Bob", LocalDate.of(1990, 3, 5)));
        printListOfStudents(list);

    }

    public static void printListOfStudents(List<Student> students) {
        for (Student stu : students) {
            System.out.println(stu.toString());
        }
    }
}
