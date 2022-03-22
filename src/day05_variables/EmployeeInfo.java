package day05_variables;

public class EmployeeInfo {

    public static void main(String[] args) {


//  create a class EmployeeInfo
// 	create a main method
// 	declare and assign these variables:
// 	first name, last name, gender, age, company name, are the full time, job title, salary, number of pto (0-25), are they married, suite(char - A, B, C, D)
//
// 	Print all the variables
//

         /*
             String firstName = "Jennet;
             String lastName = "Atamammedova";
             String companyName;
             String jobTitle;
             char gender;
             char suite
             ...
          */

        String firstName, lastName, companyName, jobTitle;
        char gender, suite;
        int age, numberOfPTO;
        double salary;
        boolean isFullTime, isMarried;

        firstName = "Jennet";
        lastName = "Atamammedova";
        companyName = "Amazon";
        jobTitle = "SDET";
        gender = 'F';
        suite = 'D';
        age = 34;
        numberOfPTO = 15;
        salary = 1_000_000; //1,000,000
        isFullTime = true;
        isMarried = true;

        String fullDetails = "Employment information: " + firstName + " " + lastName + " Gender: " + gender + "\n" + jobTitle + " at " + companyName + " currently " + age + " years old.\n" + companyName + " is located in suite " + suite + ". This years salary comes to $" + salary + "\nOther details: PTO: " + numberOfPTO + ", full time? " + isFullTime + ", married? " + isMarried;

        System.out.println(fullDetails);





            }
}
