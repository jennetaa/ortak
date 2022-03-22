package day19_string;

import java.util.Scanner;

public class Website {

    public static void main(String[] args) {

/*
    Task

        ask the user to enter a url
        find and print the website from the url

        assume your url always starts with www.
        assume your url always ends with .com

        www.google.com

        --> google
*/

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a url");

        String url = input.next(); //"www.google.com";
                                   //0123456788910

         String website = url.substring(4, url.length() - 4);
         System.out.println(website);

        // url.substring(4, 10); doesn't work for all inputs, because 10 is hardcoded

    }
}
