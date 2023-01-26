package com.mycompany.operationoftwonumbers;
import java.util.Scanner;

public class Operationoftwonumbers {

    public static void main(String[] args) {
        float number_one;
        float number_two;
        float addition;
        float substraction;
        float multiplication;
        float division;   
        float remainder;
        
        Scanner scanMe = new Scanner ( System.in);
        System.out.println("Input Number one:");
        number_one = scanMe.nextInt();
        System.out.println("Input Number Two:");
        number_two = scanMe.nextInt();
        
        addition = number_one + number_two;
        substraction = number_one - number_two;
        multiplication = number_one * number_two;
        division = number_one / number_two;
        remainder = number_one % number_two;
        System.out.println(number_one+" + "+number_two+" = "+addition);
        System.out.println(number_one+" - "+number_two+" = "+substraction);
        System.out.println(number_one+" * "+number_two+" = "+multiplication);
        System.out.println(number_one+" / "+number_two+" = "+division);
        System.out.println(number_one+" % "+number_two+" = "+remainder);
        
    }
}
