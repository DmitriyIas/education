package MinMaxAvgNumber;

import java.util.Scanner;

public class MinMaxAvgNumber {

    public void minMaxAvgCalculation() {
        System.out.println("Enter numbers:");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim();
        String[] numbers = input.split(" ");
        Integer[] nums = new Integer[numbers.length];

        for (int i = 0; i < numbers.length; i++){
            nums[i] = Integer.parseInt(numbers[i]);
        }

        System.out.println("Min - " + getMinimum(nums));
        System.out.println("Avg - " + getAverage(nums));
        System.out.println("Max - " + getMaximum(nums));

    }

    private static int getMaximum(Integer[] arr){
        int max = 0;
        for (int i = 0; i < arr.length; i++){
            if (max < arr[i])
                max = arr[i];
        }
        return max;
    }

    private static int getMinimum(Integer[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (min > arr[i])
                min = arr[i];
        }
        return min;

    }

    private static int getAverage(Integer[] arr){
        int avg = 0;
        for(int i = 0; i < arr.length; i++){
            avg += arr[i];
        }
        avg /= arr.length;
        return avg;
    }

}
