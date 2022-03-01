package IfElse;

import java.util.*;

public class IfElse4 {
    public static void main(String[] args) {

        //Get the length and the height of a rectangle from user, if they equal to eachother
        //print "Square" on the console, otherwise print "Rectangle" on the console.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the width and the length of the rectangle...");
        double w = scanner.nextDouble();
        double l = scanner.nextDouble();

        //1.Way: Java checks just a single condition ==> Less work ==> App is faster
        if(w==l) {
            System.out.println("Square");
        }else {
            System.out.println("Rectangle");
        }

        //2.Way: Java checks 2 conditions ==> More work ==> App is slower
        if(w==l) {
            System.out.println("Square");
        }
        if(w!=l) {
            System.out.println("Rectangle");
        }
    }
}
