package Arrays;

public class FindDuplicates {
    public static void main(String[] args) {
        String str = "HI RAY I AM FINE RAY"; // String with a duplicate word.

        String[] words = str.split(" "); // Splitting and converting to Array .

        for(int i = 0; i < words.length; i++){ //iterating array inside for loop

            for(int j = i+1; j < words.length; j++){ //iterating same array inside another for loop

                if (words[i].equals(words[j])){ // Using equal method i am verifying which word is repeating . System.out.println( words[i]); // here it will print duplicate .

                }}}
    }
}
