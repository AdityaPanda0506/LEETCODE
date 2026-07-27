class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return f(root.left,root.right);
    }

    boolean f(TreeNode left, TreeNode right){
        if(left == null && right == null){
            return true;
        }
        if(left == null || right == null){
            return false;
        }

        
        return (left.val == right.val) && f(left.right, right.left) && f(left.left,right.right);

    }
}