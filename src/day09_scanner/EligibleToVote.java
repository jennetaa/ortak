package day09_scanner;

public class EligibleToVote {

    public static void main(String[] args) {


        /*
           create and assign these variable:

           name
           are they citizen
           do have criminal background
           age

           determine if they are eligible to vote, they can only vote if they are a citizen,
           have no criminal background and are about age 18

           print: $name is eligible to vote: $boolean

         */


        String name = "James Bond";
        boolean isCitizen = true;
        boolean hasCriminal = false;
        int age = 49;

        boolean isEligibleBackground = age >= 18 && isCitizen && !hasCriminal;  // true && true && (!false -> true)

        System.out.println(name + "is eligible to vote: " + isEligibleBackground);

        // !true -> false
    }
}
