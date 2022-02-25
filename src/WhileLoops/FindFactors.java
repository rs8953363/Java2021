package WhileLoops;

import java.util.*;

public class FindFactors {
    public static void findFactors() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer to find its factors :");
        int num = scan.nextInt();

        int i = 1;
        while (i <= num) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
            i++;

        }
    }
}