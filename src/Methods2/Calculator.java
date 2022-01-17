package Methods2;

public class Calculator {
    public static void main(String[] args) {
        double num1 =12.0;
        double num2 = 3.0;
        System.out.println("Sum: " +add(num1, num2));
        System.out.println("Difference: " +substract(num1, num2));
        System.out.println("Product: " +multiply(num1,num2));
        System.out.println("Qutient: " +divide(num1, num2));

    }
            // this is.....
            public static double add(double num1, double num2){
                return num1 + num2;
            }
            public static double substract(double num1, double num2){
                return num1 - num2;
            }
            public static double multiply(double num1, double num2){
                return num1 * num2;
            }
            public static double divide(double num1, double num2){
                return num1/num2;
            }
        }

