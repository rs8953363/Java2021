package OOP5;

public class Inheritance4 {
    public static void main(String[] args) {

        Teacher4 object1 = new Teacher4();

        System.out.println(object1.subject);
        System.out.println(object1.name);
        System.out.println(object1.info);
        System.out.println(object1.salary);
        object1.test();

        Principal4 object2 = new Principal4();
        System.out.println(object2.info);

    }
}
