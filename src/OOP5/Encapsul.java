package OOP5;

public class Encapsul {
    String name;
    long IDNumber;
    int salary;
//Not all data need to be shared with other classes. So, removing the access to data and
// not allowing some data to be changed in the object is called Encapsulation
    //To make these variables dynamic you can create a constructor
    public Encapsul(String name, long IDNumber, int salary){
        this.name = name;
        this.IDNumber = IDNumber;
        this.salary = salary;

      //YOu cannot create objects from abstract methods
    }
}
