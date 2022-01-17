package Methods2;

public class Overloading {
    public static void main(String[] args) {
        int num1 = 40;
        int num2 =60;
        int num3 =80;
        add(num1, num2);
        add(40, 60, num3);
        //Overloading: Using more than one method with same name but different parameters(signatures). In a class, you
        // can implement two oe more methods with the same name. Overloadng is known as compile-time polymorphism
    }
    public static void add(int num1, int num2){
        int sum1 = num1+num2;
        System.out.println("Sum1: "+sum1);
    }
    public static void add(int num1, int num2, int num3){
        int sum2 = num1+num2+num3;
        System.out.println("Sum2: " +sum2);
    }
}
