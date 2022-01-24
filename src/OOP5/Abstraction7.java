package OOP5;

public class Abstraction7 {
    public static void main(String[] args) {
        Bird7 object1 = new Bird7();
        object1.speak();
       // Alive7 object2 = new Alive7(); This line give compilation error as you cannot create an object from an abstract class.
        Cat7 object4 = new Cat7();
        object4.speak();
        Alive7 object3 = new Bird7();//You can inherit from abstraction class but cannot create an object

        object1.writeInfo();
        object4.writeInfo();

    }
    }

