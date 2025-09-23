package HomeWork;

import java.util.Arrays;

public class ArrayUtil {
    public static void main(String[] args) {

        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(" ");


            }
        }

        System.out.println();

        System.out.println(numbers[0]);

        System.out.println(numbers.length - 1);

        System.out.println(numbers.length);

        int min = numbers[0];
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println(min);


        if (numbers.length % 2 == 0) {
            int mid1 = numbers[numbers.length / 2 - 1];
            int mid2 = numbers[numbers.length / 2];
            System.out.println(mid1 + "" + mid2);
        } else {
            int mid = numbers[numbers.length / 2];
            System.out.println("Middle element (odd length): " + mid);
        }
        int evenCount = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println(evenCount);

        int oddCount = 0;
        for (int num : numbers) {
            if (num % 2 != 0) {
                oddCount++;
            }
        }
        System.out.println(oddCount);

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println(sum);

        double average = (double) sum / numbers.length;
        System.out.println(average);

        System.out.println(Arrays.toString(numbers));
    }
}


