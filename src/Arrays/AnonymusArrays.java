package Arrays;

public class AnonymusArrays {
    public static void main(String[] args) {
        //Creating anonymous arrays

        System.out.println(new int[]{11, 12, 13, 14, 15}.length); //Output : 5

        System.out.println(new int[]{31, 94, 75, 64, 41}[1]); //Output : 94 }}

//        There are 2 int type array data type. One is containing 50 elements, and another one is containing 30 elements.
//        Can we assign the array of 50 elements to an array of 30 elements?
//
//        Yes we can assign provided they should the same type. The compiler will check the only type of the array, not the size.

        int[] ab = new int[30];

        int[] cd = new int[50];

        ab = cd; //Compiler checks only type, not the size
    }
}
