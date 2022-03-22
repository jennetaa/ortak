package day09_scanner;

import java.util.Scanner;

public class CompareNumbers {

    public static void main(String[] args) {

//        create a Scanner object
//        ask the user to enter 2 numbers
//        check if the number are equal to each other


        Scanner input = new Scanner(System.in);

        System.out.println("Enter number: 1");
        int num1 = input.nextInt();
        System.out.println(num1);

        System.out.println("Enter number: 2");
        int num2 = input.nextInt();

        System.out.println("The number are equal: " + (num1 == num2));

    }
}
