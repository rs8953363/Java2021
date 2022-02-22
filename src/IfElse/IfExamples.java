package IfElse;

import java.util.*;

public class IfExamples {
    public static void main(String[] args) {
        //defining an 'age' variable
        int age = 20;
        age = 9;
        //checking the age
        if (age > 18) {
            System.out.print("Age is greater than 18");
            System.out.println(15);
        } else if (age == 18) {
            System.out.println("Congratulations you are 18 years old.");
        } else {
            System.out.println("You are less than 18, sorry.");
        }

        if (age > 18) System.out.print("Age is greater than 18");
        else if (age == 18) System.out.println("Congratulations you are 18 years old.");
        else System.out.println("You are less than 18, sorry.");


        System.out.println(age);

        // Nested if :
        //Creating two variables for age and weight
//        int age=20;
        age = 20;
        int weight = 80;
        //applying condition on age and weight
        if (age >= 18) {
            if (weight > 50) {
                System.out.println("You are eligible to donate blood");
            }
        }

        if (age >= 18 && weight > 50) System.out.println("!!You are eligible to donate blood");

        String result;
        int marks;
        marks = 55;

        result = marks > 40 ? "pass" : "fail";

        System.out.println("You " + result + " the exam.");

	/*
	    Get the name of the day from user.
	 	Type java code by using if statement.
	 	When you enter the name of the day of a week,
        output will be “Weekday” or “Weekend day” according to the name of the day.
	*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any day name to check if it is week day or weekend day");
        String dayName = scan.next().toLowerCase();

        //Note: To compare Strings, DO NOT USE "==". Use "equals()" method.
        // "Ali".equals("Veli"); ==> false
        // "Ali".equals("Ali"); ==> true
        // "Ali".equals("ali"); ==> false

        if (dayName.equals("monday") || dayName.equals("tuesday") || dayName.equals("wednesday") ||
                dayName.equals("thursday") || dayName.equals("friday")) {
            System.out.println("Week day");
        }

        if (dayName.equals("saturday") || dayName.equals("sunday")) {
            System.out.println("Weekend day");
        }

        if (!dayName.equals("monday") && !dayName.equals("tuesday") && !dayName.equals("wednesday") &&
                !dayName.equals("thursday") && !dayName.equals("friday") && !dayName.equals("saturday") &&
                !dayName.equals("sunday")) {
            System.out.println("Enter a valid day name");
        }
    }
}
