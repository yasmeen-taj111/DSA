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


// Binary Tree Level Order Traversal (BFS) — ALGORITHM

// ALGORITHM: LEVEL_ORDER(root)

// If root == null, return empty list.

// Create an empty Queue q.

// Add root to q.

// While q is not empty:

// Let size = q.size() (number of nodes at current level).

// Create empty list level.

// Repeat size times:

// Remove front node from q.

// Add node’s value to level.

// If left child exists, add it to q.

// If right child exists, add it to q.

// Add level to final result.

// Return result.
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
       List<List<Integer>> res=new ArrayList<>();

       if(root==null) return res;
       Queue<TreeNode> q=new LinkedList<>();
       q.offer(root);
       while(!q.isEmpty()){
        int size=q.size();
        ArrayList<Integer> level=new ArrayList<>();
        for(int i=0;i<size;i++){
            TreeNode node=q.poll();
            level.add(node.val);

            if(node.left!=null) q.offer(node.left);
            if(node.right!=null) q.offer(node.right);
        }
        res.add(level);
       }
       return res;
    }
}
