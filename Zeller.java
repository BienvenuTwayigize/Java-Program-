package com.mycompany.zeller;
import java.util.Scanner;
public class Zeller {

    public static void main(String[] args) {    
    Scanner input = new Scanner(System.in);
    int year, month, day, k, j, h;

    System.out.println("Enter year: ");
    year = input.nextInt();

    System.out.println("Enter month: ");
    month = input.nextInt();

    System.out.println("Enter day of the month: ");
    day = input.nextInt();

    if (month < 3) {
      month += 12;
      year -= 1;
    }

    k = year % 100;
    j = year / 100;
    h = (day + (26 * (month + 1)) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;

    switch (h) {
      case 0:
        System.out.println("Day of the week is Saturday");
        break;
      case 1:
        System.out.println("Day of the week is Sunday");
        break;
      case 2:
        System.out.println("Day of the week is Monday");
        break;
      case 3:
        System.out.println("Day of the week is Tuesday");
        break;
      case 4:
        System.out.println("Day of the week is Wednesday");
        break;
      case 5:
        System.out.println("Day of the week is Thursday");
        break;
      case 6:
        System.out.println("Day of the week is Friday");
        break;
    }
  }
}