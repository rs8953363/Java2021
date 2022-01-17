package Constructor4;

public class Car5Demo {
    public static void main(String[] args) {
        Car5 object1 = new Car5(300, "Mavi");
        System.out.println(object1.speed);
        System.out.println(object1.color);
        System.out.println();

        Car5 object2 = new Car5(150, "Yesil");
        System.out.println(object2.speed);
        System.out.println(object2.color);
        System.out.println();

        Car5 object3 = new Car5(130, "Siyah");
        System.out.println(object3.speed);
        System.out.println(object3.color);
    }

}
