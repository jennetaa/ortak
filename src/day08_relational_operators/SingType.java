package day08_relational_operators;

public class SingType {

    public static void main(String[] args) {

//        Task:
//        Declare and assign a number
//
//        I want to know the sing of the number
//        if the number positive
//        is number negative
//        is the number 0

          int number = 80;

          boolean isPositive = number > 0;
          boolean isNegative = number < 0;
          boolean isZero = number == 0;

        System.out.println(number + " is positive: " + isPositive);
        System.out.println(number + " is negative: " + isNegative);
        System.out.println(number + " is zero: " + isZero);



    }
}
