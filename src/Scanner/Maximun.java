package Scanner;

import java.util.*;

public class Maximun {

        public static void main(String[] args) {
            /*
             * ask a user to get 2 numbers and write a program max number.
             */
            Scanner scan=new Scanner(System.in);
            System.out.println("Please enter 2 numbers");
            int number1=scan.nextInt();
            int number2=scan.nextInt();
            if(number1>number2) {
                System.out.println(number1);
            }else {
                System.out.println(number2);
            }
        }

    }

