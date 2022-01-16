package Methods;

public class NestedMethods {
    public static void main(String[] args) {
        //You can call a method inside of another method in Java.
        greeting();
    }
    public static void greeting(){
        writeName();
        System.out.println("Hello");
        writeCode();
        //greeting(); You can a method inside of the same method but then you get infinite loop and stackoverflow message
        // The method calls itself many times and stack overfolow. So you need to put an exit criteria
        }
    public static void writeName(){
        System.out.println("Jane");

    }
    public static void writeCode(){
        System.out.println("Java");
        writeName();
    }
}
