package LocalInstanceStatic5;

public class Localnstance {

    //If a variable can be accessed everywhere it's called instance variable.
    // Instance variables belong to class. They can be at beginning , in the middle or at the end of the class.
//As they are in the curly braces of the class you can reach them out from even methods

    int speed = 200;//instance variable (can be used both in class and methods)
    String color = "Green";//instance variable (can be used both in class and methods)
    String major;

    public void writeInfo(){
        String name = "Toyota";
        //System.out.println(number); This line gives error as number is not a variable defined in this method
        System.out.println(speed);
        System.out.println(color);
    }
    public void test(int number, String major){
        //System.out.println(name); Code gives an error for this line as name is a local variable. If a variable is
        // defined in a method you can only reach it in the same method. It's called a local variable
        System.out.println(speed);
        System.out.println(color);
        System.out.println(major);
        this.major = "Math";
        System.out.println("New major: "+major);
    }
}
