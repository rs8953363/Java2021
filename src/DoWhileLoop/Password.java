package DoWhileLoop;

import java.util.*;

public class Password {
    public static void password(){
        Scanner scan =new Scanner(System.in);
        String psw ="";
        do {
            System.out.println("Enter your password");
            psw=scan.next();
            if (psw.length()>=6) {
                System.out.println("It is okay!...");
            }else {
                System.out.println("Make the password longer than 6 characters");
            }
        } while (!(psw.length()>=6));
    }

}
