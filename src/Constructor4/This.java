package Constructor4;

public class This {
    int speed = 999;
    int model = 2005;
    int carSpeed;
    String carColor;

    public This(){
        this(150, "black");
        System.out.println("Default constructor");
        System.out.println();
    }
    public This(int speed){
        this();//This line means you need to go to default constructor. this() keyword helps you to move from constructor
        // to another constructor. this. refers to class.
        System.out.println("Single parameter constructor");
        System.out.println();
    }
    public This(int speed, String color){
        int model = 2000;
        carSpeed = speed;
        carColor = color;
        System.out.println("Double parameter constructor");
        System.out.println("Speed in class: " +this.speed);//this. refers to variables in class.
        System.out.println("Speed: "+speed);
        System.out.println("Model in class: "+this.model);
        System.out.println("Model: "+model);
    }
}
