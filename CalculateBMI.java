package com.mycompany.calculatebmi;

  import java.util.Scanner;
public class CalculateBMI {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight in kg: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter height in meters: ");
        double height = scanner.nextDouble();

        double bmi = weight / (height * height);
        System.out.println("Your BMI is: " + bmi);
    }
}