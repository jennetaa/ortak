package day13_if_statements;

import java.util.Scanner;

public class ChooseLanguage {

    public static void main(String[] args) {

/*
    ask the user to enter a number based on the language they wanted to use.
    1 - English
    2 - Spanish
    3 - Turkish
    4 - Russian
    5 - French

    based on the number they picked print a message:

    1 : "hello, thank for your call"
    2 : "hola, gracias para llamar"
    3 : "merhaba, aradiginiz icin tesekkurler"
    4 : "privet, spasibo za vash zvonok"
    5 : "Merci ,pour votre appel"
    6 : "Sag bolun jan edeniniz ucin"
    any other number: "We will use English by default"
*/

        Scanner input = new Scanner(System.in);

        System.out.println("Please choose a language: \n1 - English\n2 - Spanish\n3 - Turkish\n4 - Russian\n5 - French\n6 - Turkmen");
        int option = input.nextInt();
        String massage;

        if (option == 1) {
            massage = "Hello, thank for your call";
        } else if (option == 2) {
            massage = "hola, gracias para llamar";
        } else if (option == 3) {
            massage = "merhaba, aradiginiz icin tesekkurler";
        } else if (option == 4) {
            massage = "privet, spasibo za vash zvonok";
        } else if (option == 5) {
            massage = "Merci ,pour votre appel";
        } else if (option == 6) {
            massage = "Salam, sag bolun jan edeniniz ucin!";
        } else {
            massage = "We will use English by default";
        }
        System.out.println(massage);


    }
}
