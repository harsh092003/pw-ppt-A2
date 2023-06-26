import java.util.*;
public class array_5 {
    public static void main(String args[]){
        int nums[]={1,2,3,7};
        int maxPro=product(nums);
        System.out.println(maxPro);
    }
    public static int product(int[] nums){
        Arrays.sort(nums);
        int n = nums.length;
        int mpro=nums[n-1]*nums[n-2]*nums[n-3];
        int apro=nums[0]*nums[1]*nums[2];
        return Math.max(mpro,apro);
    }
    
}

