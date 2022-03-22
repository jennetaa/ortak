package day31_array;

import java.util.Arrays;

public class Anagram {


    public static void main(String[] args) {



        String str1 = "listen";
        String str2 = "silent";

        char [] one = str1.toCharArray();
        char [] two = str2.toCharArray();

        Arrays.sort(one);
        Arrays.sort(two);

        System.out.println(Arrays.toString(one));
        System.out.println(Arrays.toString(two));

        if(Arrays.equals(one,two)){
            System.out.println("Anagram");
        }else{
            System.out.println("Not Anagram");
        }

        System.out.println(Arrays.equals(one,two) ? "Anagram" : "Not Anagram");


    }
}
