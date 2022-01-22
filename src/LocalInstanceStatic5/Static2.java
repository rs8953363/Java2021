package LocalInstanceStatic5;

public class Static2 {
    int speed = 200;//Unless you create and object for this class, speed and color variables are not added to the memory and you cannot use them.
    String color = "Blac";
    static  int model =2015;//This is added to the memory

    public static void Information(){//This method is added to memory as well.
        //System.out.println(speed); There cannot be a non-static variable in static method. This line gives compilation
        // error. If you want to use speed and color in this method you need to either make them static or make this method
        // non-static.
    }
}
