package Arrays;

public class IndexOfElement {
    public static int findIndex (int[] my_array, int t) {

        int startPoint = 0;

        int endPoint = my_array.length - 1;

        while (startPoint <= endPoint) {

            int mid = (startPoint + end) / 2;

            if (key == my_array[mid]) {

                return mid;

            }

            if (key < my_array[mid]) {

                endPoint = mid - 1;
            } else {

                startPoint = mid + 1;

            }

        }

        return -1;

    }

    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16};

        System.out.println("Key 14's position: "findIndex(arr, 14));

        int[] arr1 = {6,34,78,123,432,900};

        System.out.println("Key 432's position: "+findIndex(arr1, 432));

    }
}
