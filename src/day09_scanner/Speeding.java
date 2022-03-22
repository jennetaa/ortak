package day09_scanner;

public class Speeding {
    public static void main(String[] args) {

//      create a class  called Speeding, and write a program to determine if the car speeding
//
//      declare 3 variables:
//      current speed, speed limed, speeding boolean
//
//      print
//      "Are you speeding? " true/false

        int currentSpeed = 58;
        int speedLimed = 55;

        boolean isSpeeding = currentSpeed > speedLimed;

        System.out.println("Are you speeding: " + isSpeeding);

    }
}
