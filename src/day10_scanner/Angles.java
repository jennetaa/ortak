package day10_scanner;

import java.util.Scanner;

public class Angles {

    public static void main(String[] args) {

          /*
    Write a program that asks the user to enter 3 angle numbers (can be floating numbers)
    Determine if the angles make a triangle, which means the angles add to 180.0
    and
    Determine if the angles make a circle, which means the angles add to 360.0

     */

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter 3 angle numbers");
        double angleOne = keyboard.nextDouble();
        double angleTwo = keyboard.nextDouble();
        double angelThree = keyboard.nextDouble();

        double sum = angleOne + angleTwo + angelThree;

        boolean isTriangle = sum == 180;
        boolean isCircle = sum == 336;

//      boolean isTriangle = angleOne + angleTwo + angelThree == 180;
//      boolean isCircle = angleOne + angleTwo + angelThree == 360;

        System.out.println("is a triangle: " + isTriangle);
        System.out.println("is a circle: " + isCircle);



    }
}
