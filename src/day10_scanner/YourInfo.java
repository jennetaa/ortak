package day10_scanner;

import java.util.Scanner;

public class YourInfo {

    public static void main(String[] args) {

        /*
         Ask the user to enter their age (byte)
         Ask them to enter their favorite number (long)
         Ask them to enter their favorite book
         Ask them to enter their favorite color
         Print all the values from the input

         */

        Scanner in = new Scanner(System.in);

        System.out.print("Enter your favorite book ");
        String book = in.nextLine();

        System.out.print("Enter your favorite color ");
        String color = in.nextLine();

        System.out.print("Enter your favorite movie ");
        String movie = in.nextLine();

        System.out.print("What is your age? ");
        byte age = in.nextByte();

        System.out.print("What is your favorite number? ");
        long favoriteNumber = in.nextLong();

        System.out.println(book + "\n" + color + "\n" + movie + "\n" + age + "\n" + favoriteNumber);

//      System.out.println(book):  // we can print both ways
//      System.out.println(age);
//      System.out.println(color);
//      System.out.println(movie);
//      System.out.println(favoriteNumber);
    }
}
