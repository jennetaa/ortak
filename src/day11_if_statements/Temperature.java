package day11_if_statements;

import java.util.Scanner;

public class Temperature {

    public static void main(String[] args) {

//        Task:
//        ask the user to enter the temperature
//
//        if the temperature is above or equal to 70
//        print: It's a nice day
//        Go outside, but with your laptop to code java
//        if the temperature is less than 70
//        print: Its too cold
//        Code more java

        Scanner input = new Scanner(System.in);

        System.out.println("Pleas enter the temperature");
        int temperature = input.nextInt(); // Scanner version, get dynamic values from the console

        // int temperature = 100; hard coded version

        if (temperature >= 70) {
            System.out.println("Its a nice day");
            System.out.println("Go outside, but with your laptop to code java");
        } else {
            System.out.println("Its too cold");
            System.out.println("Code more java");
        }

    }

}
