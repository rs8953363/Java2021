package OOP4Principles;

public class OverridingInheritanceDemo extends OverridingInheritance {//extends keyword helps this class to see Example2 class. This is called inheritance.
    // Inheritance is good for reusibility of code
    //Class is a blueprint for an object. //This is an object for a class. Object have variables and methods
    String name;
    public static void main(String[] args) {

        OverridingInheritanceDemo e1 = new OverridingInheritanceDemo();//Object creation to use Example2 class
        e1.sayHi();//Even though sayHi is not in this class we can access it because we used extends word.
    }
    public void sayName(){
        System.out.println("My name!");
    }
    //You can have multiple methods with the same name but different parameters. This is called polymorphism(many forms).
    //This means overloading a method. Another type of polymorphism is overriding a method.
    public void sayName(String name){
        System.out.println("My name is "+name);
    }

    //change the functionality of the sayHi method by writing it into this class. This overrides the method in Example2
    // class as it has the same name and same type of parameters
    public void sayHi(){
    }
}
