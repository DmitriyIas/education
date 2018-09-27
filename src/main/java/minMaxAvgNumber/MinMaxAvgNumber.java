package minMaxAvgNumber;

import java.util.Scanner;

import static runner.Runner.LOGGER;

public class MinMaxAvgNumber {

    private MinMaxAvgNumber(){}

    public static void minMaxAvgCalculation() {
        Integer[] numbers = inputNumberArray();
        String min = "Min - ".concat(String.valueOf(getMinimum(numbers)));
        String avg = "Avg - ".concat(String.valueOf(getAverage(numbers)));
        String max = "Max - ".concat(String.valueOf(getMaximum(numbers)));

        LOGGER.info(min);
        LOGGER.info(avg);
        LOGGER.info(max);

    }

    private static Integer[] inputNumberArray() {
        LOGGER.info("Enter space separated numbers:");
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
