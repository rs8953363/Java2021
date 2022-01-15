package Techprod.StaticKeyword;

public class StaticMember {
    static int x;
    int y;

    StaticMember(){
        x +=2;
        y++;
    }
    static int getSquare(){
        return x*x;
    }
}
