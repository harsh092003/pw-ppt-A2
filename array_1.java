import java.util.*;

public class array_1 {
    public static void main(String args[]) {
        int nums[] = { 1, 4, 3, 2 };
        int result = maxSum(nums);
        System.out.println("Maximum possible sum: " + result);

    }

    public static int maxSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i=i+2) {
            sum = sum + nums[i];

        }
        return sum;

    }

}
