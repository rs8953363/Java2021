package Primitives;

import java.util.*;

public class OverallGrade {
    /*
         Ask user to enter mid-term grade, final grade, and project grade
         Calculate the general grade (mid-term : 30% , project : 20%, final : 50%)

          Example:
              INPUT: mid-term grade=78
                     final grade = 66
                     project grade = 90
              OUTPUT: "Your grade is : 81,6"

         */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter mid-term grade");
        int num1=sc.nextInt();
        System.out.println("enter final grade");
        int num2= sc.nextInt();
        System.out.println("enter project grade");
        int num3 = sc.nextInt();

        double generalGrade = (num1*3/10) + (num2/2) + (num3/5);

        System.out.println("Your grade is= " + generalGrade);
    }
}
