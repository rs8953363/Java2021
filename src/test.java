import java.util.*;

public class test {
    public static void main(String[] args) {
        int[] numbers = {6, 9, 1};
//            int temp = numbers[0];
//        for (int i = 0; i < numbers.length-1; i++) {
//            numbers[i] = numbers[i+1];
//            numbers[numbers.length-1] = temp;
//            temp=numbers[i+1];
//            System.out.print(numbers[i]+" ");

        int temp;
        temp = numbers[0];
        for (int i = 0; i < numbers.length - 1; i++) {
            numbers[i] = numbers[i + 1];

        }
        numbers[numbers.length - 1] = temp;
        System.out.println(Arrays.toString(numbers));
    }
}