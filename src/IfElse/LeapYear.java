package IfElse;

import java.util.*;

public class LeapYear{
	/*
		Type java code by using nested if() statement.
		Write a program to check if a year is leap year or not.
		If the year is divisible by 100 then it must be divisible by 400.
		If a year is not divisible by 100 then it must be divisible by 4.
	*/

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a year...");
            int year = scan.nextInt();

            if(year<0) {

                System.out.println("Enter a valid year..");

            }else if(year%100==0) {

                if(year%400==0) {
                    System.out.println(year + " is leap year...");
                }else {
                    System.out.println(year + " is not leap year...");
                }

            }else {

                if(year%4==0) {
                    System.out.println(year + " is leap year...");
                }else {
                    System.out.println(year + " is not leap year...");
                }

            }

            /*
		Type java code by using nested ternary.
		Write a program to check if a year is leap year or not.
		If the year is divisible by 100 then it must be divisible by 400.
		If a year is not divisible by 100 then it must be divisible by 4.
	 */
                String r = (year%100==0) ? (year%400==0 ? "The year is leap year" : "The year is not leap year") :
                        (year%4==0 ? "The year is leap year" : "The year is not leap year");
                System.out.println(r);
            }
        }



