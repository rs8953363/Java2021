package DoWhileLoop;

public class Car {
    /*
	 	When you create a class, Java knows you will create objects.
	 	To create objects you need "constructor", because of that Java puts "constructor" behind the class for you.
	 	That kind of constructors are called "default constructor"
	*/

    public String make = "Honda";
    public String model = "Accord";
    public int price = 20000;
    public int year = 2020;

    public static void main(String[] args) {
        Car myCar1 = new Car();

        System.out.println(myCar1.make);

        System.out.println(myCar1.model);

        System.out.println(myCar1.price);

        System.out.println(myCar1.year);

        myCar1.move();

        myCar1.stop();
    }

    public static void move() {
        System.out.println("Moves fast");
    }

    public static void stop() {
        System.out.println("The car can stop");
    }
}

