package Objects3;

public class InformationDemo {
    public static void main(String[] args) {


        Information object = new Information();

        System.out.println(object.number);
        System.out.println(object.bool);
        System.out.println(object.str);
        System.out.println(object.average);

        object.number = 34;
        object.bool = true;
        object. str = "Happy";
        object.average = 0.58f;

        System.out.println(object.number);
        System.out.println(object.bool);
        System.out.println(object.str);
        System.out.println(object.average);
    }
}
