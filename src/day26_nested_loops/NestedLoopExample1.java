package day26_nested_loops;

public class NestedLoopExample1 {

    public static void main(String[] args) {


        for(int i = 0; i < 5; i++){
            System.out.println("Hello world");
        }

        System.out.println("Hello Universe\n");



        for(int i = 0; i < 5; i++){
            System.out.println("Hello world");
        }

        System.out.println("Hello Universe\n");


        for(int i = 0; i < 5; i++){
            System.out.println("Hello world");
        }

        System.out.println("Hello Universe\n");


        System.out.println("----------------------------------");

        for(int j = 0; j < 3; j++){

            for(int i = 0; i < 5; i++){
                System.out.println("Hello world");
            }

            System.out.println("Hello Universe\n");

        }

    }
}
