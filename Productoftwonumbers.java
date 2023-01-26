package com.mycompany.productoftwonumbers;
import java.util.Scanner;

public class Productoftwonumbers {

    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;
        int product ;
       //Scanner
       Scanner scanMe = new Scanner ( System.in);
       System.out.println("Enter the First Number: ");
       firstNumber = scanMe.nextInt();
       System.out.println("Enter the second Number: ");
       secondNumber = scanMe.nextInt();
       product = firstNumber * secondNumber; 
       System.out.println(firstNumber+" X "+secondNumber+" = "+product );
    }
}
