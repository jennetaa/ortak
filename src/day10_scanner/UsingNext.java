package day10_scanner;

import java.util.Scanner;

public class UsingNext {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is today ");
        String day = input.nextLine();

        System.out.println("Enter your first name ");
        String firstName = input.next();

        System.out.println("Enter your last name ");
        String lastName = input.next(); // to send this data, you need to hit enter

        input.nextLine(); // to enter input from the line above is absorbed here

        System.out.println("What is your address");
        String address = input.nextLine();


        System.out.println("Today: " + day + "\nFirst name: " + firstName + "\nLast name: " + lastName + "\nWhat is your address: " + address);

    }
}
