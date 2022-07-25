package Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        public static void main(String[] args) {

            int myArr[] = { 14, 46, 47, 86, 92, 52, 48, 36, 66, 85 };

            int largest = myArr[0];

            int secondLargest = myArr[0];

            System.out.println("The given array is:" );

            for (int i = 0; i < myArr.length; i++) {

                System.out.print(myArr[i]+"\t");

            }

            for (int i = 0; i < myArr.length; i++) {

                if (myArr[i] > largest) {

                    secondLargest = largest;

                    largest = myArr[i];

                } else if (myArr[i] > secondLargest) {secondLargest = myArr[i];

                }}

            System.out.println("\nSecond largest number is:" + secondLargest);

        }
    }
}
