package day22_loops;

public class Letters {

    public static void main(String[] args) {

        // a - z lowercase

        System.out.println("Entre the letter: ");
        char lowerCaseUp = 'a';

        while (lowerCaseUp <= 'z'){
            System.out.print(lowerCaseUp + " ");
            lowerCaseUp++;
        }

        System.out.println();

        // Z - A uppercase

        char uppercaseBack = 'Z';  // int i = 122

        while (uppercaseBack >= 'A'){
            System.out.print(uppercaseBack + " ");  // (char)i
            uppercaseBack--;
        }
    }
}
