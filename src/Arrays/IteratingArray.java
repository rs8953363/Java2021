package Arrays;

public class IteratingArray {
    public static void main(String[] args) {
        //Can we use Generics with the array? No

        //Iterate an array in java?
        //1) Using normal for loop

                int[] a1 = new int[]{45, 12, 78, 34, 89, 21};

//Iterating over an array using normal for loop

                for (int i = 0; i < a1.length; i++) {
                    System.out.println(a1[i]);
                }

                //Using extended new for loop

           int[] a2 = new int[]{45, 12, 78, 34, 89, 21};

//Iterating over an array using extended for loop

                for (int i: a2){
                    System.out.println(i);
                }
    }
}
