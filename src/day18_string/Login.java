package day18_string;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

/*

        Ask the user to enter a username
        make sure the username is in lowercase

        Ask the user to enter a password
        check if the password is more than 8 characters long

        valid system password: "jamesbond"

        -> if the entered password is matches the system password
           logged

           otherwise print:

           invalid password

*/

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a username!");
        String username = input.next();

        username = username.toLowerCase();

        System.out.println("Please enter your password");
        String password = input.next();

        if(password.length() >= 8 && password.equals("Jennet")){
            System.out.println("Logged in with " + username);
        }else{
        System.out.println("Invalid password");
    }

         System.out.println(username);

    }
}
