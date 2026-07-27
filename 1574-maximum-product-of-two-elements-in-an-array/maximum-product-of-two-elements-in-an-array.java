class Solution {
    public int maxProduct(int[] nums) {
        
        int  n = nums.length;

        Arrays.sort(nums);
        int maxi = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int pro = (nums[i] - 1)* (nums[j] -1);
                maxi = Math.max(pro,maxi);
            }
        }

        return maxi;
    }
}