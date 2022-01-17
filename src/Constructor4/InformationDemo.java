package Constructor4;

public class InformationDemo {
    public static void main(String[] args) {

        Information object = new Information();//number is 25 now.

        System.out.println(object.number);
        System.out.println(object.name);

        object.number=30;
        System.out.println(object.number);
    }
}
