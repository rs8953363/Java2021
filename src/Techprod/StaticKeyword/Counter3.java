package Techprod.StaticKeyword;

public class Counter3{
    int count;
    static int stCount;

    public Counter3() {
        count++;
        stCount++;
    }

    public int getCount() {
        return count;
    }

    public static int getStCount() {
        return stCount;
    }

    public static void main(String[] args) {
        Counter cs1 = new Counter();
        Counter cs2 = new Counter();
        Counter cs3 = new Counter();
        Counter cs4 = new Counter();
        Counter cs5 = new Counter();
        Counter cs6 = new Counter();

        System.out.println("count is: " +cs1.getCount());
        System.out.println("stCount is: " + cs1.getStCount());
        System.out.println("count is: " +cs6.getCount());
        System.out.println("stCount is: " + cs6.getStCount());
    }
}

