package Arrays;

public class DuplicatesInArray {
    public static void main(String[] args) {

                String[] strArray1 = {"abc1", "def1", "mno1", "xyz1", "pqr1", "xyz1", "def1"};

                for (int i = 0; i < strArray1.length-1; i++) {

                    for (int j = i+1; j < strArray1.length; j++) {

                        if( (strArray1[i].equals(strArray1[j])) && (i != j) ) {

                            System.out.println("Duplicates : "+strArray1[j]);

                        }}}

        String str = "HI RAHUL I AM FINE RAHUL"; // String with a duplicate word.

        String[] words = str.split(" "); // Splitting and converting to Array .

        for(int i = 0; i < words.length; i++){ //iterating array inside for loop

            for(int j = i+1; j < words.length; j++){ //iterating same array inside another for loop

                if (words[i].equals(words[j])){ // Using equal method i am verifying which word is repeating . System.out.println( words[i]); // here it will print duplicate .

                }}}
    }
}
