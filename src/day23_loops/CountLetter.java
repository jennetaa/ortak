package day23_loops;

public class CountLetter {

    public static void main(String[] args) {


 /*

    Given a String we want to count how many 'a' characters we have

    Challenge: adjust so that we can check for not only 'a' but any character

*/

        String word = "aabbcca";
        char letter = 'a';

        int count = 0;

        for (int i = 0; i < word.length(); i++){

            if(word.charAt(i) == letter){   // checks if every character is equal to a
                count++;
            }
        }

        System.out.println(count);

    }
}
