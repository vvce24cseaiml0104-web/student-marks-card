
package com.example;

import java.util.Scanner;

public class StudentMarksCard {

    public static String calculateGrade(double percentage) {

        if (percentage > 90) {
            return "A Grade";
        }
        else if (percentage > 80) {
            return "B Grade";
        }
        else if (percentage >= 70) {
            return "C Grade";
        }
        else {
            return "D Grade";
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== STUDENT MARKS CARD =====");

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        String rollNo = sc.nextLine();

        System.out.print("Enter Subject 1 Marks: ");
        int m1 = sc.nextInt();

        System.out.print("Enter Subject 2 Marks: ");
        int m2 = sc.nextInt();

        System.out.print("Enter Subject 3 Marks: ");
        int m3 = sc.nextInt();

        int total = m1 + m2 + m3;

        double percentage = total / 3.0;

        String grade = calculateGrade(percentage);

        System.out.println("\n========== MARKS CARD ==========");
        System.out.println("Student Name : " + name);
        System.out.println("Roll Number  : " + rollNo);
        System.out.println("Subject 1    : " + m1);
        System.out.println("Subject 2    : " + m2);
        System.out.println("Subject 3    : " + m3);
        System.out.println("--------------------------------");
        System.out.println("Total Marks  : " + total + "/300");
        System.out.printf("Percentage   : %.2f%%%n", percentage);
        System.out.println("Grade        : " + grade);
        System.out.println("================================");

        sc.close();
    }
}
