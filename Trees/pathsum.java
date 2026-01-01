// 112. Path Sum

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

//recursive approach
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null) return false;
        if(root.left==null && root.right==null) return root.val==targetSum;
        int rem=targetSum-root.val;
        return hasPathSum(root.left,rem)||hasPathSum(root.right,rem);


    }
}

//iterative approach
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null) return false;
        Queue<TreeNode> node=new LinkedList<>();
        Queue<Integer> sum=new LinkedList<>();
        node.offer(root);
        sum.offer(targetSum);
        while(!node.isEmpty()){
            TreeNode curr=node.poll();
            int currsum=sum.poll();
            if(curr.left==null && curr.right==null && currsum==curr.val) return true;
            if(curr.left!=null){
            node.offer(curr.left);
            sum.offer(currsum-curr.val);

            }
            if(curr.right!=null){
            node.offer(curr.right);
            sum.offer(currsum-curr.val);
            }
        }

      return false;
    }
}
