public class array_6 {
    public static void main(String args[]) {
        int nums[] = { -1, 0, 3, 5, 9, 12 };
        int target = 9;
        int index = Bsearch(nums, target);
        System.out.println(index);
    }

    public static int Bsearch(int[] nums,int target){
        int l=0;
        int r=nums.length-1;
    
        while(l<=r){
            int m=l+(r-l)/2;
            if(nums[m]==target){
                return m;
            }
            else if(nums[m]< target){
                l=m+1;
            }
            else {
                r=m-1;
            }
        }
        return -1;

    }
}

