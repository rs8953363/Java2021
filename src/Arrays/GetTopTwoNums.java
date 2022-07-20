package Arrays;

public class GetTopTwoNums {
    public static void main(String[] args) {
        import java.util.Arrays;

        public class TopTwoMaximumNumbers{

            public static void main(String args[]) {

                topTwoNumbers(new int[]{20, 34, 21, 87, 92, Integer.MAX_VALUE});

                topTwoNumbers(new int[]{0, Integer.MIN_VALUE, -2});

                topTwoNumbers(new int[]{Integer.MAX_VALUE, 0, Integer.MAX_VALUE});

                topTwoNumbers(new int[]{1, 1, 0}); }

            public static void topTwoNumbers(int[] numbers) {

                int max01 = Integer.MIN_VALUE;

                int max02 = Integer.MIN_VALUE; for (int number : numbers) {

                    if (number > max01) { max02 = max01; max01 = number; }

                    else if (number > max02) { max02 = number; } }

                System.out.println("First largest number is : " + max01);

                System.out.println("Second largest number is : " + max02); } }
    }
}
