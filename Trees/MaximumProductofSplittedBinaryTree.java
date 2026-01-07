// 1339. Maximum Product of Splitted Binary Tree

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

// brute force->TLE

// product = subtreeSum × (totalSum - subtreeSum)
class Solution {
    static final int MOD= 1_000_000_007;
    long maxp=0;

    public long summ(TreeNode root){
        if(root==null) return 0;
        return root.val+summ(root.left)+summ(root.right);
    }
    public long subb(TreeNode root){
        if(root==null) return 0;
        return root.val+subb(root.left)+subb(root.right);
    }

    public void dfs(TreeNode root,TreeNode node,long sum){
        if(node==null) return;
        if(node!=root){
            long sub=subb(node);
            long p=sub*(sum-sub);
            maxp=Math.max(maxp,p);
        }
        dfs(root,node.left,sum);
        dfs(root,node.right,sum);

    }
    public int maxProduct(TreeNode root) {
     long sum=summ(root);
     dfs(root,root,sum);
     return (int)(maxp%MOD);
        
    }
}

// optimal

class Solution {
    static final int MOD= 1_000_000_007;
    long maxp=0;
    long sum=0;

    public long summ(TreeNode root){
        if(root==null) return 0;
        return root.val+summ(root.left)+summ(root.right);
    }
    
    public long dfs(TreeNode root){
        if(root==null) return 0;
        long leftt=dfs(root.left);
        long rightt=dfs(root.right);
        long sub=root.val+leftt+rightt;
        long p=sub*(sum-sub);
        maxp=Math.max(maxp,p);
        return sub;

    }
    public int maxProduct(TreeNode root) {
     sum=summ(root);
     dfs(root);
     return (int)(maxp%MOD);
        
    }
}
