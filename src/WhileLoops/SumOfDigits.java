package WhileLoops;

import java.util.*;

public class SumOfDigits {

    public static void main(String[] args) {

        sumOfDigits();

    }
	/*
	 	Interview Question
	 	Type java code by using while loop,
         Write a program that prompts the user to input an integer.
         It should then find sum of the digits of that number.
         	123 ==> 1+2+3 = 6
	 */

    public static void sumOfDigits() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an integer ");
        int num = sc.nextInt();

        int originalNum = num;

        int sum = 0;

        if (num < 0) {
            num *= (-1);
        }

        while (num != 0) {
            sum += num % 10;// 123%10=3
            num /= 10;
        }

        System.out.println("The sum of the digits of " + originalNum + " is " + sum);

        sc.close();
    }
}
