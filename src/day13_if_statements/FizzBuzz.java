package day13_if_statements;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

       /*

       you will have a number

       if the number is divisible by 3 print -> Fizz
       if the number is divisible by 5 print -> Buzz
       if the number is divisible by both 3 and 5 -> FizzBuzz
       if the number is not divisible by any of those, print just the number

     */
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = input.nextInt();


        if(n % 3 == 0 && n % 5 == 0){
            System.out.println("FizzBuzz");
        }else if(n % 3 == 0){
            System.out.println("fizz");
        }else if(n % 5 == 0) {
            System.out.println("Buzz");
        }else {
            System.out.println(n);
        }




    }
}
