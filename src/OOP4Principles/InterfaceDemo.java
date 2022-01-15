package OOP4Principles;

public class InterfaceDemo implements Interface {
    public static void main(String[] args) {
        InterfaceDemo e2 = new InterfaceDemo();
        e2.openBag();
    }

    @Override
    public void openBag() {
        System.out.println("Bag opened");
    }
}
