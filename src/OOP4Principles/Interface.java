package OOP4Principles;

public interface Interface {//change the word class with interface. Interface is just list of variables and methods
    String flavor = "Beef";

    void openBag();

}
/*an interface is just a list of variables and methods, we don't need to implement or put code inside the method we're just listing
them out. Abstraction: only the details that the user needs to know are there, and everything else is hidden.
You can bring methods and variables from other classes by
inheriting those methods using the extends keyword and you can also take a list of methods and variables and implement
those methods using the implements keyword and you can also have access to private variables by making methods to change
them and get them called setters and getters and that's called encapsulation.
 */