package Methods2;

public class MethodEx {
    public static void main(String[] args) {
        //methods can help with reusability, readibility and clear understanding. For example parseInt is a method in Java class

        int[] numbers1 = {10, 20, 30, 40, 50};
        int[] numbers2 = {100, 200, 300, 400, 500};//for each of these arrays, you need to write another method to find the arrays sum
        int[] numbers3 = {1000, 2000, 3000, 4000, 5000};//which means too many lines of code

        int sum1 = 0;
        for (int num : numbers1) {
            sum1 += num;
        }
        int sum2 = 0;
        for (int num : numbers2) {
            sum2 += num;
        }
        int sum3 = 0;
        for (int num : numbers3) {
            sum3 += num;
        }
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);

        System.out.println(sum(new int[]{101, 201, 301, 401, 501}));
        System.out.println(sum(new int[]{1001, 2001, 3001, 4001, 5001}));
        System.out.println(sum(new int[]{10001, 20001, 30001, 40001, 50001}));

    }

    //Instead of three for each loop, you can use a method and call it three times.
    //You can write as many methods as you want in a class. You don't have to run all the methods you created in a class.
    public static int sum(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
}