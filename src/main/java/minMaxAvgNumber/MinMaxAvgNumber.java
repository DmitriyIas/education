package minMaxAvgNumber;

import java.util.Scanner;

public class MinMaxAvgNumber {

    public static void minMaxAvgCalculation() {
        Integer[] numbers = inputNumberArray();
        System.out.println("Min - " + getMinimum(numbers));
        System.out.println("Avg - " + getAverage(numbers));
        System.out.println("Max - " + getMaximum(numbers));

    }

    private static Integer[] inputNumberArray() {
        System.out.println("Enter space separated numbers:");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim();
        String[] numbers = input.split(" ");
        Integer[] nums = new Integer[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            nums[i] = Integer.parseInt(numbers[i]);
        }

        return nums;
    }

    private static int getMaximum(Integer[] arr) {
        int max = 0;
        for (int i : arr) {
            if (max < i)
                max = i;
        }
        return max;
    }

    private static int getMinimum(Integer[] arr) {
        int min = arr[0];
        for (int i : arr) {
            if (min > i)
                min = i;
        }
        return min;

    }

    private static int getAverage(Integer[] arr) {
        int avg = 0;
        for (int i : arr) {
            avg += i;
        }
        avg /= arr.length;
        return avg;
    }

}
