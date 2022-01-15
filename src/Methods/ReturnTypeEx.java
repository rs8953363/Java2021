package Methods;

public class ReturnTypeEx {
    public static void main(String[] args) {
        addition(20, 70);
        int result = add(30,50);
        System.out.println(result);

    }
    public static void addition(int num1, int num2){//Method with no return type
        int sum1 = num1+num2;
        System.out.println("Sum = "+sum1);
    }

    public static int add(int num1, int num2){
        int sum2=num1+num2;
        return sum2;
    }
}
