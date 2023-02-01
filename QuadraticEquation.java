package com.mycompany.quadraticequation;
import java.util.Scanner;

public class QuadraticEquation {

public static void main(String[] args) {
Scanner ScanMe = new Scanner (System.in);

int a;
int b; 
int c;
double discriminant_quadratic;
double r1;
double r2;
double root;
        
System.out.println("Enter the value of a: " );
a = ScanMe.nextInt();

System.out.println("Enter the value of b: ");        
b = ScanMe.nextInt();

System.out.println("Enter the value of c: ");
c = ScanMe.nextInt();

discriminant_quadratic = b*b-4*a*c;
          
if( discriminant_quadratic > 0){

r1= ( -b + Math.sqrt( discriminant_quadratic))/(2*a);
r2= ( -b - Math.sqrt( discriminant_quadratic))/(2*a);

System.out.println("The equation has two root such as "+r1+" and"+r2);
}

else if (discriminant_quadratic == 0){
root = -b/(2*a);

System.out.println("The equation has only one root which is "+root);  
}

else{

System.out.println("The equation has no real root");
}
        
  }
}
