package day05_variables;

public class MyName {

    public static void main(String[] args) {

        /*
          create a class MyName
          create a main method
          create multiple char variables, one for each letter of your name
          print your name
              print each letter in a different line
              print your name in the same line
         */

        char first = 'J'; //here we are declaring the variable(ch1) and assigning the value(J) at the same time.
        char second = 'e';
        char third = 'n';
        char fourth = 'n';
        char fifth = 'e';
        char sixth = 't';


        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(fourth);
        System.out.println(fifth);
        System.out.println(sixth);

        System.out.println("My name is: " + first + second + third + fourth + fifth + sixth);

        // or you can make a variable of the name

        String name = "" + first + second + third + fourth + fifth + sixth; // String name "Jennet"
        System.out.println("My name: " + name);



//        char ch7; // declaring variable
//        ch7 = 'A';  // assigning a value(A) into the variable(ch7)
//        System.out.print(ch7);
//
//        ch7 = 'T'; // reassigning the value(T) into the variable(ch7)
//        System.out.println(ch7);



    }
}
