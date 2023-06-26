import java.util.*;
public class array_3 {
     public static void main(String[] args) {
        int[] nums = {1, 3, 2, 2, 5, 2, 3, 7};
        int result = subsequence(nums);
        System.out.println(result); 
    }
    public static int subsequence(int[] nums) {
        Arrays.sort(nums);
        int maxLen = 0;
        int left = 0;
        int right = 0;

        while (right < nums.length) {
            int diff = nums[right] - nums[left];

            if (diff == 1) {
                maxLen = Math.max(maxLen, right - left + 1);
                right++;
            } else if (diff > 1) {
                left++;
            } else {
                right++;
            }
        }

        return maxLen;
    }

}

