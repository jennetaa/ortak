package day28_array;

public class AddElements {

    public static void main(String[] args) {


/*

        declare and assign an array of numbers

               {3, 6, 10}

        sum all the numbers in the array

*/

        int [] numbers = {13, 18, 28 , 18};
        System.out.println("Hardcoded sum: " + (numbers[0] + numbers[1] + numbers[2] + numbers[3]));

       int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);


    }
}
