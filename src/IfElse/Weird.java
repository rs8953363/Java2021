package IfElse;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Weird {

    /*Given an integer n.
If  is odd, print Weird
If  is even and in the inclusive range of  to , print Not Weird
If  is even and in the inclusive range of  to , print Weird
If  is even and greater than , print Not Weird

     */

        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            int N = Integer.parseInt(bufferedReader.readLine().trim());
            solve(N);
            bufferedReader.close();
        }
        public static void solve(int num){
            if(num%2!=0){
                System.out.println("Weird");
            }else {
                if(num>=2 && num<=5) {
                    System.out.println("Not Weird");
                }else if(num>=6 && num<=20){
                    System.out.println("Weird");
                }else {
                    System.out.println("Not Weird");
                }
            }
        }
    }

