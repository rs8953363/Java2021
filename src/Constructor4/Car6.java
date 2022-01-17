package Constructor4;

public class Car6 {

    public Car6() {

        //Calling two or more constructors in the same class with the "this" keyword does not create more than one object.
        this(200);//If you are going to call another constructor in this constructor you need to put this keyword
        // as  first thing. You cannot change places of these two lines.
        System.out.println("Default constructor");
    }
    public Car6(int speed){
        this(180, "Siyah");
        System.out.println("One-parameter constructor");
    }
    public Car6(int speed, String color){
        System.out.println("Two-parameter constructor");
    }
}
