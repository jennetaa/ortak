package day08_relational_operators;

public class OperatorPractice2 {

    public static void main(String[] args) {


        int a = 40;  // a = 40 -> 39 -> 38 -> 38 -> 37 -> 36 -> 35 -> 34

        System.out.println(--a);  // pre decrement, subtract 1 right away, then it prints the of a, which is 39

        System.out.println(--a);  // pre decrement, subtract 1 right away, then it prints the of a, which is 38

        System.out.println(a--);  // post decrement, first get the current value of a which is 38 and prints it, then it subtracts one

        System.out.println(--a);  // pre decrement, subtract 1 right away, then it prints the of a, which is 36

        System.out.println(--a);  // pre decrement, subtract 1 right away, then it prints the of a, which is

        System.out.println(a--);  // post decrement, first get the current value of a which is 35 and prints it,  then it subtracts one
        System.out.println(a);


    }
}
