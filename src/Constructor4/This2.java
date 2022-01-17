package Constructor4;

public class This2 {

    int number;
    int speed;
    String color;

    public This2(int speed, String color){
        this.speed = speed;
        this.color = color;
    }

    public void writeInformation(int number){
        this.number = number;
        System.out.println("Number received");
    }
}
