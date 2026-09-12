class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ng = new int[10001];
        Stack<Integer> s = new Stack<>();

        for(int i=nums2.length-1;i>=0;i--){
            while(!s.isEmpty() && s.peek() <= nums2[i]){
                s.pop();
            }
            ng[nums2[i]] = s.isEmpty() ? -1 : s.peek();
            s.push(nums2[i]);
        }

        for(int i=0;i<nums1.length;i++){
            nums1[i] = ng[nums1[i]];
        }

        return nums1;
    }
}