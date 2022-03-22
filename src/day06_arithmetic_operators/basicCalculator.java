package day06_arithmetic_operators;

public class basicCalculator {

    public static void main(String[] args) {

//        rithmetic Operators
//        + addition
//        - subtraction
//        * multiplication
//        / division
//        % remainder/modulus
//        When you use arithmetic operators between two different datatypes
//        the result will be the bigger type.
//                - When you use datatypes like short or byte and use some arithmetic
//        operators the values are changed to int, so the result of the operation is
//        also int

        double num1 = 5;
        double num2 = 4;

        /*
    10 / 3 = 3.3333
    10 % 3 = 1
        3 + 3 + 3 -> 3
        10 - 9 -->

   5/4 = 1.25
   5 % 4
       4 --> 1
       5 - 4 = 1

  */
        double addition = num1 + num2;
        double subtraction = num1 - num2;
        double multiplication = num1 * num2;
        double division = num1 / num2;
        double remainder = num1 % num2;

        System.out.println(num1 + " + " + num2 + " = " + addition);
        System.out.println(num1 + " - " + num2 + " = " + subtraction);
        System.out.println(num1 + " * " + num2 + " = " + multiplication);
        System.out.println(num1 + " / " + num2 + " = " + division);
        System.out.println(num1 + " % " + num2 + " = " + remainder);

        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));

    }

}

