package ForLoops1;

import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter your number");
        int num=scan.nextInt();
        int fact=1;
        for (int i = 1; i <=num; i++) {
            fact=fact*i;
        }
        System.out.println(num+"!="+fact);
    }
}
