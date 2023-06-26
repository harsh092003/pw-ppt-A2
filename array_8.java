public class array_8 {
    public static void main (String args[]){
        int nums[]={1};
        int k=0;
        int minScore=score(nums,k);
        System.out.println(minScore);
    }
    public static int score(int[] nums, int k){
        int min=nums[0];
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
        }
        int score=max-min;

        if(score>2*k){
            return score-2*k;
        }
        else{
            return 0;
        }
    }
    
}

