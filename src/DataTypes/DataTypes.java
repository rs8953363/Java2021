package DataTypes;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DataTypes {

        public static void main(String[] args) {
            int i = 4;
            double d = 4.0;
            String s = "HackerRank ";

            Scanner scan = new Scanner(System.in);
            int j = scan.nextInt();
            double e = scan.nextDouble();
            scan.nextLine();
            String t = scan.nextLine();

            System.out.println(i + j);
            System.out.println(d + e);
            System.out.println(s + t);

            /* Declare second integer, double, and String variables. */
            /* Read and save an integer, double, and String to your variables.*/
            /* Print the sum of both integer variables on a new line. */
            /* Print the sum of the double variables on a new line. */
        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */

            scan.close();
        }
}