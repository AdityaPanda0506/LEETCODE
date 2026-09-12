class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {

        if(k<= 1) return 0;
        int l = 0;
        int c = 0;
        int p = 1;
        int n = nums.length;

        for(int i=0;i<n;i++){
            p = p*nums[i];

            while(p>=k) p = p/nums[l++];
            c += i-l+1;

        }

        return c;
    }
}