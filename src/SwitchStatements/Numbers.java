package SwitchStatements;

import java.util.*;

public class Numbers {
    public static void main(String[] args) {
        /*If the user pressed 1, 2, 3
         * the program will print the number that is pressed;
          otherwise, program will print "Not allowed".
         *
         */

        Scanner s=new Scanner(System.in);

        System.out.println("Please enter the number :");

        int a=s.nextInt();

        switch(a) {
            case 1:
                System.out.println(" the number that is pressed");
                break;
            case 2:
                System.out.println(" the number that is pressed");
                break;
            case 3:
                System.out.println(" the number that is pressed");
                break;
            default :
                System.out.println(" the number that not is allowed");

        }

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer");
        int d = scan.nextInt();

        switch(d) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Not allowed");

        }

        scan.close();

        }
    }



