package Constructor4;

public class Car4 {
    int speed = 200;
    String color = "White";

    public Car4(){

        speed = 150;
    }
    public Car4(int givenSpeed){
    }
    public Car4(String givenColor){
        color = "Green";
    }
    public Car4(int givenSpeed, String givenColor){
        speed = 250;
        color = "Blue";
    }
}
