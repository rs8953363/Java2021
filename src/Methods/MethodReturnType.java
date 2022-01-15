package Methods;

public class MethodReturnType {
    public static void main(String[] args) {
        showInfo();//There is no return type. Only functions, does not return any result. You cannot assign it to a variable.

        sum(20,40);//The return type is int. YOu can assign it to a variable.
        System.out.println(sum(20,40));
        int result = sum(30,70);
        System.out.println(result);
    }
    //Methods with void return type don't return any value
    public static void showInfo(){
        System.out.println("Hello");
        System.out.println("Welcome");
    }
    public static int sum(int num1, int num2){
        int sum =num1+num2;
        return sum;
    }
}
