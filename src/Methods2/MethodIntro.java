package Methods2;

public class MethodIntro {
    public static void main(String[] args) {
        sayHello();//coling sayHello method
        sayHello();
        AskHowRY();
        reply();
        sayBay();
        sayHelloTo(" Nazim");
        String nameOfFriend="Umit";
        sayHelloTo(nameOfFriend);

    }
    public static void sayHelloTo(String name) {
        System.out.println("Hello" + name);

    }
    public static void sayHello() {
        System.out.println("hello");
        System.out.println("hi!");

    }

    public static void AskHowRY() {
        System.out.println("How are you");
    }
    public static void reply() {
        System.out.println("I am doing well, hpw about you");
    }
    public static void sayBay() {
        System.out.println("Bye Have a good day");
    }
}
