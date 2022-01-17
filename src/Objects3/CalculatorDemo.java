package Objects3;

public class CalculatorDemo {
    public static void main(String[] args) {

        Calculator object = new Calculator();
        System.out.println(object.add(12,4));
        System.out.println(object.subtract(400,100));
        System.out.println(object.multiply(3,6));
        System.out.println(object.divide(45,15));
    }
}
