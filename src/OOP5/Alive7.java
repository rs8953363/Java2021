package OOP5;

public abstract class Alive7 {
    //You can create an abstract method in abstract class but not in normal classes.
    //Abstract methods do not have to have body.
    String name = "asdf";
    int test = 1234;

    public abstract void speak();//abstract methods cannot be static.
    public abstract void breathe();
//Abstract class cares what the subclasses do it doesn't care how they do it.
    public void writeInfo(){//Abstract classes can have non-abstract methods, as well.
        System.out.println("Information.");
    }
}
