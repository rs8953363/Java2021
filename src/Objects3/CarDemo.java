package Objects3;

public class CarDemo {
    public static void main(String[] args) {
        Car audi = new Car();

        System.out.println("Maximum speed: "+audi.maxSpeed);
        System.out.println("Color: "+audi.color);
        System.out.println("Vites: "+audi.vites);
        System.out.println("Model: "+audi.model);

        audi.start();
        audi.stop();
    }
}
