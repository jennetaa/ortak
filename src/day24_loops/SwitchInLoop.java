package day24_loops;

public class SwitchInLoop {

    public static void main(String[] args) {

        String numbers = " ";

        for (int i = 0; i <= 5; i++) {

            switch (i) {
                case 0:
                    numbers = "Zero";
                    break;
                case 1:
                    numbers = "One";
                    break;
                case 2:
                    numbers = "Two";
                    break;
                case 3:
                    numbers = "Three";
                    break;
                case 4:
                    numbers = "Four";
                    break;
                case 5:
                    numbers = "Five";
                    break;
                default:
                    System.out.println("Invalid numbers");

            }

            System.out.println("Enter a numbers: " + numbers);
        }



    }
}
