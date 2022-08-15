package Scanner;

import java.util.Scanner;

public class Area {
    Scanner scan= new Scanner ( System.in);
        System.out. println("please enter width and length ");

    double length = scan.nextDouble();
    double width = scan.nextDouble();
        System.out.println(2* (width + length));
}
