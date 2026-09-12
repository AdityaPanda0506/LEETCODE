class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int c = 0;
        int n = nums.length;
        int p = 1;

        for(int i=0;i<n;i++){
            p = 1;
            for(int j=i;j<n;j++){
                p = p*nums[j];
                if(p<k){
                    c++;
                }else{
                    break;
                }
            }
        }
        return c;
    }
}