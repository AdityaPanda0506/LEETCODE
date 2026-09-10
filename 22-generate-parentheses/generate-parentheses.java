class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();

        b(ans,0,0,"",n);
        return ans;
    }
    void b(List<String> ans, int left, int right, String s, int n){
        if(s.length() == 2*n){
            ans.add(s);
            return;
        }

        if(left<n){
            b(ans,left+1,right,s+'(',n);
        }
        if(right<left){
            b(ans,left,right+1,s+')',n);
        }
    }
}