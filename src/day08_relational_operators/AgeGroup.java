package day08_relational_operators;

public class AgeGroup {

    public static void main(String[] args) {

//        Task:
//        declare and assign an age variable
//        is the person a kid (up to 13, include 13)
//        is the person a senior citizen (65 and above)

        int age = 13;

        boolean isKid = age <= 13;
        boolean isSenior = age >= 65;

        System.out.println("you are a kid: " + isKid);
        System.out.println("You are a senior citizen: " + isSenior);
    }
}
