package day09_scanner;

public class GoForWalk {

    public static void main(String[] args) {

        // Want to go for walk

        // We will go for walk if it is not raining and the weather is above 70

        // There is no need to check the weather if it is raining

        boolean isRaining = true;
        int temperature = 80;

        System.out.println("Go for walk: " + (!isRaining && temperature > 70)); // !false --> true


    }
}
