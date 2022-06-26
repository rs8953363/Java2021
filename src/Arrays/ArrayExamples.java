package Arrays;

import java.util.Arrays;
public class ArrayExamples {
    public static void main(String[] args) {
        int schoolmarks [] = {25, 30, 50, 10, 5 };

        System.out.println (Arrays.toString (schoolmarks));

        int [] num1 = { 1, 2, 3 };

        int[] num2 = { 4, 5, 6 };

        System.out.println (Arrays.equals (num1, num2)); //false

        int [] num3 = {1, 2, 3};

        System.out.println (Arrays.equals (num1, num3)); //true

        int n = num1.length+1;

        int total = n*(n+1)/2;

        for(int i =0;i<num1.length;i++){

            total -=num1[i];}

        System.out.println(total);
    }
}
