package Methods;

public class MethodTypes {
    public static void main(String[] args) {
        addition();//() means it's a method. If there is no (), it means it's a variable.
        System.out.println("Footer line");
        addition();
        System.out.println();
        addition(30,50);

    }
    public static void addition(){
        System.out.println("Addition method has been called");
        System.out.println("Hello");
    }
    //The methods in the same class can have the same name, but different parameters
    public static void addition(int num1, int num2){
        int sum = num1+num2;
        System.out.println("Sum is "+sum);

    }
}
