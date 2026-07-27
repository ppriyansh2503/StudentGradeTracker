package com.priyanshu;

import java.util.ArrayList;

public class GradeManager {

    private ArrayList<Student> students;

    // Constructor
    public GradeManager() {
        students = new ArrayList<>();
    }

    // Add Student
    public void addStudent(Student student) {
        students.add(student);
    }

    // Display All Students
    public void displayStudents() {

        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        System.out.println("\n===== Student List =====");

        for (Student student : students) {
            System.out.println("Name  : " + student.getName());
            System.out.println("Marks : " + student.getMarks());
            System.out.println("--------------------------");
        }
    }

    // Calculate Average Marks
    public double calculateAverage() {

        if (students.isEmpty()) {
            return 0;
        }

        double total = 0;

        for (Student student : students) {
            total += student.getMarks();
        }

        return total / students.size();
    }

    // Get Highest Marks
    public double getHighestMarks() {

        if (students.isEmpty()) {
            return 0;
        }

        double highest = students.get(0).getMarks();

        for (Student student : students) {
            if (student.getMarks() > highest) {
                highest = student.getMarks();
            }
        }

        return highest;
    }

    // Get Lowest Marks
    public double getLowestMarks() {

        if (students.isEmpty()) {
            return 0;
        }

        double lowest = students.get(0).getMarks();

        for (Student student : students) {
            if (student.getMarks() < lowest) {
                lowest = student.getMarks();
            }
        }

        return lowest;
    }

    // Total Students
    public int getTotalStudents() {
        return students.size();
    }
}