/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<Integer> list = new ArrayList<>();
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
      list = getElements(root1,list);
      list = getElements(root2,list);  
       Collections.sort(list);
        return list;
    }
    public List<Integer> getElements(TreeNode root,List<Integer> list){
        if(root == null)
            return list;
        
        list.add(root.val);
        
        getElements(root.left,list);
        getElements(root.right,list);
        
        return list;
    }
}
