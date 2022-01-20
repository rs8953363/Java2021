package LocalInstanceStatic5;

public class Static2Demo {

    int number = 99;
    public static void main(String[] args) {
        System.out.println("Main method");
    }
}
//The static method can not use non static data member or call non-static method directly.
//this and super cannot be used in static context.