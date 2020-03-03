package edu.mum.cs.cs425.demos.studentrecordsmgmtapp.model;


import java.time.LocalDate;
import java.time.Period;

public class Student {
    private int studentId;
    private String studentName;
    private LocalDate dateOfAdmission;

    public Student(int studentId, String studentName, LocalDate dateOfAdmission) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.dateOfAdmission = dateOfAdmission;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public LocalDate getDateOfAdmission() {
        return dateOfAdmission;
    }

    public void setDateOfAdmission(LocalDate dateOfAdmission) {
        this.dateOfAdmission = dateOfAdmission;
    }

    public int calculateAge(LocalDate birthDate, LocalDate currentDate) {
        if ((birthDate != null) && (currentDate != null)) {
            return Period.between(birthDate, currentDate).getYears();
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", dateOfAdmission=" + dateOfAdmission +
                '}';
    }




}
