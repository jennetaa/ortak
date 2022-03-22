package day10_scanner;

import java.util.Scanner;

public class Revenue {

    public static void main(String[] args) {


//       Write a program that asks the user to enter a price and quantity
//        and then calculate the revenue = price x quantity.



        // popular names for Scanner: scan, input, scanner, keyboard

        Scanner scan = new Scanner(System.in);  // make a Scanner variable

        System.out.println("Enter the price of the item");
        double price = scan.nextDouble();

        System.out.println("Enter the quantity");
        int quantity = scan.nextInt();

        double revenue = price * quantity;
        System.out.println("The revenue is: $" + revenue);


    }
}
