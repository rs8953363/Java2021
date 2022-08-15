package Scanner;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the length of the rectangle");
        double length = scan.nextDouble();

        System.out.println("Please enter the width of the rectangle");
        double width = scan.nextDouble();

        System.out.println("The are of the rectangle is " + length * width);
        System.out.println("The perimeter of the rectangle is " + (length + width) * 2);
    }
}
