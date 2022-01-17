package Constructor4;

public class This2Demo {
    public static void main(String[] args) {

        This2 object = new This2(200, "black");
        System.out.println(object.speed);
        System.out.println(object.color);
        object.writeInformation(56);
    }
}
