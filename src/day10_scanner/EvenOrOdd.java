package day10_scanner;

import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {

        /*
         Ask the user to enter a number. Check if that number is evenly divisible
         by 2, 3, and 5. Print the boolean values
         Ex:
         Enter a number
         65

         65 is divisible by 2: false
         65 is divisible by 3: false
         65 is divisible by 5: true
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = input.nextInt();

        boolean by1 = num % 2 == 0;
        boolean by2 = num % 3 == 0;
        boolean by3 = num % 5 == 0;
        boolean by4 = num % 8 == 0;

        System.out.println(num + " is divisible by 2: " + by1);
        System.out.println(num + " is divisible by 3: " + by2);
        System.out.println(num + " is divisible by 5: " + by3);
        System.out.println(num + " is divisible by 8: " + by4);




    }
}
