public class array_7 {
    public static void main(String args[]){
        int nums[]={3,2,2,1};
        boolean isMonotonic=checkMonotonic(nums);
        System.out.println(isMonotonic);
    }
    public static boolean checkMonotonic(int[] nums){
        boolean incr=true;
        boolean decr=true;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                incr=false;
                
            }
            if(nums[i]>nums[i-1]){
                decr=false;
                
            }
        }
        return incr||decr;
    }
}
