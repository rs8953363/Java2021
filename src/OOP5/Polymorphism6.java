package OOP5;

public class Polymorphism6 {
    public static void main(String[] args) {
        //An object can behave like more than one object. This is called polymorphism
        //Since classes have the characteristics of all their parent classes, they can create object not only from their
        // class, but also from parent class.
         Animal6 object1 = new Animal6();
         Cat6 object2 = new Cat6();
         Animal6 object3 = new Cat6();

         object1.speak();
         object2.speak();
         object3.speak();
    }
}
