package com.priyanshu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        GradeManager gradeManager = new GradeManager();

        System.out.println("=================================");
        System.out.println("      STUDENT GRADE TRACKER");
        System.out.println("=================================");

        while (true) {

            System.out.println("\n===== MENU =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Show Summary");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    sc.nextLine();

                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Student Marks: ");
                    double marks = sc.nextDouble();

                    if (marks < 0 || marks > 100) {
                        System.out.println("Invalid Marks! Enter marks between 0 and 100.");
                        break;
                    }

                    Student student = new Student(name, marks);
                    gradeManager.addStudent(student);

                    System.out.println("Student Added Successfully!");
                    break;

                case 2:

                    gradeManager.displayStudents();
                    break;

                case 3:

                    System.out.println("\n========== SUMMARY REPORT ==========");
                    System.out.println("Total Students: " + gradeManager.getTotalStudents());
                    System.out.printf("Average Marks : %.2f%n", gradeManager.calculateAverage());
                    System.out.println("Highest Marks : " + gradeManager.getHighestMarks());
                    System.out.println("Lowest Marks  : " + gradeManager.getLowestMarks());

                    break;

                case 4:

                    System.out.println("Thank you for using Student Grade Tracker!");
                    sc.close();
                    return;

                default:

                    System.out.println("Invalid Choice!");
            }
        }
    }
}