package IfElse;

import java.util.*;

public class Triangle {

        public static void main(String[] args) {
            Scanner scan =new Scanner(System.in);
            System.out.println("kenar gir");
            double kenar1= scan.nextDouble();
            double kenar2= scan.nextDouble();
            double kenar3=scan.nextDouble();

            if(kenar1==kenar2 && kenar2==kenar3)
                System.out.println("ucgen");
            else
                System.out.println("ucgen değil");
            scan.close();
        }
    }

