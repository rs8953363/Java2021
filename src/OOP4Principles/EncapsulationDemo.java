package OOP4Principles;

public class EncapsulationDemo {
    public static void main(String[] args) {
        Encapsulation e1 = new Encapsulation();
        e1.setFlavor("Beef");
        System.out.println(e1.getFlavor());//This is called encapsulation.  We can reach a private variable from a
        // different class with getter and setter.

    }
}
