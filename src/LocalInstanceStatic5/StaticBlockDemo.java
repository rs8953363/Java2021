package LocalInstanceStatic5;

public class StaticBlockDemo {
    public static void main(String[] args) {
        System.out.println(StaticBlock.speed);//This statement prints 250 in the console, because the value of speed has
        // been changed in the static block.
    }
}
