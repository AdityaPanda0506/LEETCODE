class Solution {

    int c=0;
    public int findTargetSumWays(int[] nums, int target) {
        ways(nums,0,0,target);
        return c;
    }

    void ways(int[] nums, int ci, int sum, int target){
        if(ci == nums.length){
            if(sum == target){
                c++;
        }
        }else{
            ways(nums,ci+1,sum + nums[ci], target);
            ways(nums,ci+1,sum - nums[ci], target);
        }
    }
}