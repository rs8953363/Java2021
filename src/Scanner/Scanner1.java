package Scanner;

import java.util.*;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the parameters of the prism: ");
        double length=scan.nextDouble();
        double width=scan.nextDouble();
        double height=scan.nextDouble();

        System.out.println("Please enter the length of the rectangle");
        length = scan.nextDouble();

        System.out.println("Please enter the width of the rectangle");
        width = scan.nextDouble();

        System.out.println("The are of the rectangle is " + length * width);
        System.out.println("The perimeter of the rectangle is " + (length + width) * 2);

        System.out.println("The volume of the rectangular prism is: "+(width*length*height));
    }
    }
