package LocalInstanceStatic5;

public class StaticBlock {
 static int speed = 200;
 String color = "Mavi";

 static{//static block
     speed= 250;
     //color = "Black"; You cannot call a non-static variable in a static method
 }
 int vites = 5;
}
