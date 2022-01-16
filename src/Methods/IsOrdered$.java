package Methods;

public class IsOrdered$ {
    public static void main(String[] args) {
        int[] numbers1 = {20, 45, 100, 60};
        boolean result1 = orderedArray(numbers1);
        System.out.println(result1);
        int[] numbers2 = {100, 90, 80, 70, 60};
        System.out.println(orderedArray(new int[]{100, 90, 80, 70, 60}));

    }
    public static boolean orderedArray(int[] arr){
        boolean inOrder = true;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]<arr[i+1])
                inOrder=false;
        }
        return inOrder;
    }
}
