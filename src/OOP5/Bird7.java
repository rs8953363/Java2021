package OOP5;

public class Bird7 extends Alive7 {
//If a class inherits an abstract class, it has to add the abstract methods in that class with override
    @Override
    public void speak(){
        System.out.println("Cik cik");
    }
    @Override
    public void breathe(){
    }
}
