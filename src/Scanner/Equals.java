package Scanner;

import java.util.*;

public class Equals {
    public static void main(String[] args) {
        /*
         Type java code by using if-else statement,
if the password is “JavaLearner”, output will be “The password is true”.
Otherwise, output will be “The password is false”.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the password");
        String password = scan.nextLine();
        if(password.equals("JavaLearner")) {
            System.out.println("This password is true");
        }else {
            System.out.println("The password is false");
        }
        scan.close();
    }
}

