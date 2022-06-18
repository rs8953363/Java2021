package Arrays;

import java.util.Arrays;
public class CompareTwoArrays {
    public static void main(String[] args) {
        int [] num1 = { 1, 2, 3 };

        int[] num2 = { 4, 5, 6 };

        System.out.println (Arrays.equals (num1, num2)); //false

        int [] num3 = {1, 2, 3};

        System.out.println (Arrays.equals (num1, num3)); //true

        //Sort an Array
        int Marks [] = {12, 5, 7, 9};

        Arrays.sort(Marks);

        System.out.println(Arrays.toString(Marks));//[5, 7, 9, 12]
    }
}
