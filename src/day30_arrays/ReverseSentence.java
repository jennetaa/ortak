package day30_arrays;

public class ReverseSentence {

    public static void main(String[] args) {


        String s = "Today is Monday, we learned String methods";
        String [] days = s.split(" ");


        for(String day : days){
            System.out.println(day);
        }

        System.out.println("----------------------");


        String str = "Today is Monday, we learned String methods";
        String [] words = str.split(" ");

        String reversed = "";

        for(int i = words.length -1; i >= 0; i--){
            reversed += words[i] + " ";
        }

        System.out.println(reversed.trim());
    }
}
