package day14_nested_if_statements;

public class NestedExample {

    public static void main(String[] args) {

        boolean a = true;
        boolean b = false;
        boolean c = true;

        if (a) {
            System.out.println(1);

            if (b) {
                System.out.println(2);

            }
            if (c) {
            } else {
                System.out.println(3);
            }
        } else {

            System.out.println("z");
        }


    }
}

