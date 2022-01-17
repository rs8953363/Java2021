package Objects3;

public class Car2Demo {
    public static void main(String[] args) {
        //You can change variables' values in this class by creating object.
        //You don't need to create a class each time.
        Car2 object = new Car2();
        System.out.println(object.speed);
        System.out.println(object.name);
        System.out.println();

        Car2 toyota = new Car2();
        toyota.speed = 190;
        toyota.speed = 225;
        System.out.println(toyota.speed);
        System.out.println(toyota.name);
        System.out.println();

        Car2 audi = new Car2();
        audi.speed = 300;
        audi.name = "New Audi";
        System.out.println(audi.speed);
        System.out.println(audi.name);

    }
}
