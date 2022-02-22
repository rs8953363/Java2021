package Scanner;

import java.util.*;

public class AddDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a 3 digit integer ");
        int x = scan.nextInt();
        // x = abc
        int c = x % 10;
        int b = (int) ((x / 10)) % 10;
        int a = (int) ((x / 100));
        System.out.println(a + b + c);
    }
}
