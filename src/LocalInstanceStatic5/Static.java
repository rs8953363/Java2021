package LocalInstanceStatic5;

public class Static {

    //Static keyword is used for memory management and it's created only once in the memory.
    //It does not depend on objects. Variables, methods and some classes can be static.
    static int model = 2015;//This variable is not dependable to all 3 objects created in demo class. It's same for all
    // of them.It's not added to all objects. It belongs to class
    //So if the value of static variable is chnaged, it's changed for all objects
    int vites;
    int speed;
    String color;

    public Static(int speed, String color, int vites){
        this.vites = vites;
        this.speed = speed;
        this.color = color;
    }
    public void test(){
        System.out.println("Test");//You need an object to call this method. Because it's not static.
    }
    public static void information(){
        System.out.println("Information received");//You can call this method by using class, because it's static.

    }
}
