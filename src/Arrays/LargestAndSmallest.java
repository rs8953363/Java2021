package Arrays;

import java.util.Arrays;

public class LargestAndSmallest {

            public static void largestAndSmallest(int[] numbers) {

                int largest = Integer.MIN_VALUE;

                int smallest = Integer.MAX_VALUE;

                for (int number : numbers) {

                    if (number > largest) {

                        largest = number;

                    }

                    else if (number < smallest) {

                        smallest = number;

                    } }
                System.out.println("Largest is : " + largest);

                System.out.println("Smallest is : " + smallest); } }

