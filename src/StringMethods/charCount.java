package StringMethods;

public class charCount {
    public static void main (String args[]){
        String str = "abbabbcaacb";
        int count = 0;
        int index = 0;
        for (int i = 0; i < str.length()-1; i++) {
            if (str.substring(i,i+1).equals("a")) {
                count++;

            }
        }
        System.out.println("the number of occurences of a is " +count);
        System.out.println("the index of occurences of a is " +str.indexOf("a",0));
    }
}
