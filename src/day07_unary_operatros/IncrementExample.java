package day07_unary_operatros;

public class IncrementExample {

    public static void main(String[] args) {

//        Unary Operators
//        + (plus) positive number
//                - (minus) negative number
//                ++ incrementing, adding 1
//                -- decrementing, subtracting 1
//        int num = 0;
//        pre-increment: increment the value before the rest of the statement
//        is run
//        ++num
//        pre-decrement: decrements the value before the rest of the statement
//        is run
//        --num
//        post-increment: increments the value after the statement is run
//        num++
//        post-decrement: decrements the value after the statement is run

        int x = 0;
        System.out.println(x);  // 0

        x = x + 1;  // take value of x, which is 0 then i add 1 -> 0 + 1 = 1
        System.out.println(x); // 1

        x++;  // post increment
        System.out.println(x);  // 2

        ++x;  // pre increment
        System.out.println(x);  // 3

        System.out.println(++x); // because it is pre-increment it will add 1 right away os 4 is printed

        System.out.println(x++); // statement is run first because it is a post increment, we will see 4

        System.out.println(x);







    }
}
