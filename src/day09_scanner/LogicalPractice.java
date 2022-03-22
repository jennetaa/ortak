package day09_scanner;

public class LogicalPractice {

    public static void main(String[] args) {


//  Evaluate/compare two boolean expressions and result in a boolean

//        All logical operators return Boolean (true or false)
//            operator                description
//              &&                    Logical AND
//              ||                    Logical OR
//              !                     Logical NOT


        int n = 20;

        System.out.println(n > 5);  // true
        System.out.println(n < 10); // false

        System.out.println(n > 5 && n < 10); // true && false --> false


        System.out.println(4 > 3 || false);  // true || false
        System.out.println(4 > 4 || false);  // false || false

        System.out.println(!false); // not false --> true
        System.out.println(!true);  // not true --> false

        System.out.println(4 != 4);






    }
}
