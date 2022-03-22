package day05_variables;

public class ConcatenationExample {

    public static void main(String[] args) {

        System.out.println(5 + 4); // int by default

        System.out.println(5 + 4 + "hello");
                          // int + int -> int
                          // 9 (int) + "hello" (String) -> String

        System.out.println("hello" + 5 + 4);
                         // String + int -> String = hello5
                         // hello (String) + 4(int) = hello54
    }
}
