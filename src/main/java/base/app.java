package base;
import java.text.DecimalFormat;
import java.util.*;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jose Valencia
 */

public class app {

    public static void main(String[] args) {
        Scanner newScan = new Scanner(System.in);
        DecimalFormat numFormat = new DecimalFormat("#.000000");

        //Input
        System.out.print("Enter a 1 if you are a male or a 2 if you are a female: ");
        int gender = newScan.nextInt();

        System.out.print("How many ounces of alcohol did you have? ");
        int ounces = newScan.nextInt();

        System.out.print("What is your weight, in pounds? ");
        int weight = newScan.nextInt();

        System.out.print("How many hours has it been since your last drinks? ");
        int hours = newScan.nextInt();

        //Calculations
        double ratio = 0;
        if(gender == 1)
            ratio = 0.73;
        if(gender == 2)
            ratio = 0.66;

        double BAC = (ounces * 5.14 / weight * ratio) - .015 * hours;

        //Output
        System.out.println("Your BAC is " + numFormat.format(BAC));

        if(BAC < 0.08)
            System.out.println("It is legal for you to drive.");
        else
            System.out.println("It is not legal for you to drive.");
    }

}
