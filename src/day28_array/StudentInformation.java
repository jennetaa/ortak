package day28_array;

import java.util.Arrays;
import java.util.Scanner;

public class StudentInformation {


    public static void main(String[] args) {

/*
        all String types
        0 -> id
        1 -> first name
        2 -> last name
        3 -> batch number
     */

        String [] studentOne = {"3235", "Jennet", "Atamammedova", "26"};
        System.out.println(Arrays.toString(studentOne));

        String [] studentTwo = new String[4];
      //System.out.println(Arrays.toString(studentTwo));

        studentTwo[0] = "010";
        studentTwo[1] = "Ali";
        studentTwo[2] = "Ata";
        studentTwo[3] = "24";
        System.out.println(Arrays.toString(studentTwo));

        String [] studentThree = new String[4];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your id");
        studentThree[0] = input.nextLine();
        System.out.println("Enter your first name");
        studentThree[1] = input.nextLine();
        System.out.println("Enter your last name");
        studentThree[2] = input.nextLine();
        System.out.println("What is your batch number");
        studentThree[3] = input.nextLine();
        System.out.println(Arrays.toString(studentThree));

        String [] studentFour = new String[4];
        String [] questions = { "Enter your id", "Enter your first name", "Enter your last name", "What is your batch number"};

        for (int i = 0; i < 4; i++){
            System.out.println(questions[i]); // reading each element of the questions array
            studentFour[i] = input.nextLine(); // assigning the Scanner input into our studentFour array
        }

        System.out.println(Arrays.toString(studentFour));






    }
}
