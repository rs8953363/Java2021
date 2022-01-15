package Techprod.StaticKeyword;

public class StaticMemberDemo {
    public static void main(String[] args) {
        StaticMember sm1 = new StaticMember();
        StaticMember sm2 = new StaticMember();
        int z = sm1.getSquare();
        System.out.println("-x" +z+ "-y" +sm2.y);
    }
}
