package com.mycompany.scorestudent;
import java.util.Scanner;
public class ScoreStudent {

    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numOfStudents = scan.nextInt();
        String highestName = "";
        int highestScore = Integer.MIN_VALUE;
        String secondHighestName = "";
        int secondHighestScore = Integer.MIN_VALUE;

        for (int i = 0; i < numOfStudents; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            String name = scan.next();
            System.out.print("Enter the score of student " + (i + 1) + ": ");
            int score = scan.nextInt();

            if (score > highestScore) {
                secondHighestName = highestName;
                secondHighestScore = highestScore;
                highestName = name;
                highestScore = score;
            } else if (score > secondHighestScore) {
                secondHighestName = name;
                secondHighestScore = score;
            }
        }

        System.out.println("The student with the highest score is " + highestName + " with a score of " + highestScore);
        System.out.println("The student with the second-highest score is " + secondHighestName + " with a score of " + secondHighestScore);
    }
}




