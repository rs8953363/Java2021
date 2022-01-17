package Methods2;

public class LargestNumberInArray {
    public static void main(String[] args) {
        int result = largest(new int[] {1,4,5,20,2});
        System.out.println(result);
        System.out.println();
        int[] numbers = {1,400, 5,2569, 2};
        System.out.println(largest(numbers));
    }
    public static int largest(int[] array){
        int max= array[0];//Yuo can also assign int max=0 or int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i]>max)
                max = array[i];
        }
        return max;
    }
}
