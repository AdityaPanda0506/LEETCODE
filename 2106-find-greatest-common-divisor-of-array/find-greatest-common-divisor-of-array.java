class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);

        int a = nums[0];
        int b = nums[nums.length -1];

        return gcd(b,a);
    }

    int gcd(int a, int b){
        while(b != 0){
            int temp = b;
            b = (a%b);
            a = temp;
        }
        return a;
    }
}