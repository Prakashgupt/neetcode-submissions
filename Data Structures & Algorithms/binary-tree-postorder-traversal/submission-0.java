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
    public List<Integer> postorderTraversal(TreeNode root) {

        List<Integer> list = new ArrayList<>();
        DFS(root,list);

        return list;
        
    }

    public void DFS(TreeNode root, List<Integer> list)
    {
        if(root== null) return ;

        DFS(root.left,list);
        DFS(root.right,list);
        list.add(root.val);

    }
}