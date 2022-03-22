package day04_variables;

public class School {

    public static void main(String[] args) {

        int numberOfStudentInGrade1 = 30;
        int numberOfStudentInGrade2 = 25;
        int numberOfStudentInGrade3 = 34;
        int numberOfStudentInGrade4 = 19;
        int numberOfStudentInGrade5 = 28;

        int totalNumberOfStudents = numberOfStudentInGrade1 + numberOfStudentInGrade2 + numberOfStudentInGrade3 + numberOfStudentInGrade4 + numberOfStudentInGrade5;

        double numberOfDayInYear = 101.5;
        double numberOfSnowDays = 5.5;
        double averageGpaInSchool = 3.5;

        System.out.println("NumberOfStudentInGrade1: = " + numberOfStudentInGrade1);
        System.out.println("NumberOfStudentInGrade2: = " + numberOfStudentInGrade2);
        System.out.println("NumberOfStudentInGrade3: = " + numberOfStudentInGrade3);
        System.out.println("NumberOfStudentInGrade4: = " + numberOfStudentInGrade4);
        System.out.println("NumberOfStudentInGrade5: = " + numberOfStudentInGrade5);

        System.out.println("TotalNumberOfStudents = " + totalNumberOfStudents);

        System.out.println("Total number of days in the year: " + numberOfDayInYear);
        System.out.println("Number snow days: " + numberOfSnowDays);
        System.out.println("Average GPA: " + averageGpaInSchool);


    }
}
