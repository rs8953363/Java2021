package LocalInstanceStatic5;

public class Private {
    private long IDnumber = 200123546593l;//The purpose of private modifier is security. We don't want to give access from other classes.
    String name = "Hillary";
    int age = 42;

    public void test(){
        System.out.println("Deneme");
    }
    private void information(){
        System.out.println("Bilgi");
    }
}
