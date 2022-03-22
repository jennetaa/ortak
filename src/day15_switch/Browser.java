package day15_switch;

import java.util.Scanner;

public class Browser {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter you browser");
        String browser = input.nextLine();

        System.out.println("Enter you url");
        String url = input.nextLine();


        switch (browser){

            case "chrome":
            case "Chrome":
                System.out.println("Opining " + url + " in the chrome browser");
                System.out.println("Loading...");
                break;
            case "Safari":
            case "safari":
                System.out.println("Open " + url + " in safari");
                break;
            case "Firefox":
                System.out.println("Open " + url + " in firefox");
                break;
            default:
                System.out.println(browser + " is not a valid browser");

        }



    }
}
