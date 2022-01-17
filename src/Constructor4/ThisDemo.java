package Constructor4;

public class ThisDemo {
    public static void main(String[] args) {

        This object1 = new This(200);
        System.out.println(object1.carSpeed);
        System.out.println(object1.carColor);

        This object2 = new This(200, "Brown");
        System.out.println(object2.carSpeed);
        System.out.println(object2.carColor);
        System.out.println(object2.speed);
    }


}
