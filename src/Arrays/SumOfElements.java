package Arrays;

public class SumOfElements {
    public static void main(String[] args) {
        int ar [] = new int[]{1,2,3,5,6,7};
        int n = ar.length+1;

        int total = n*(n+1)/2;

        for(int i =0;i<ar.length;i++){

            total -=ar[i];}

        System.out.println(total);
    }
}
