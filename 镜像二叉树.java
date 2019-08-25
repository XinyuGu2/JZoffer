/**
题目描述
操作给定的二叉树，将其变换为源二叉树的镜像。
输入描述:
二叉树的镜像定义：源二叉树 
    	    8
    	   /  \
    	  6   10
    	 / \  / \
    	5  7 9 11
    	镜像二叉树
    	    8
    	   /  \
    	  10   6
    	 / \  / \
        11 9 7  5
        
 */

 /**
  * 解题思路：链接：https://www.nowcoder.com/questionTerminal/564f4c26aa584921bc75623e48ca3011
来源：牛客网
对于本题，首先假设root的左右子树已经都处理好了，即左子树自身已经镜像了，
右子树自身也镜像了，那么最后一步就是交换左右子树，问题解决。
所以我只需要将root.left和root.right交换即可。下面进入递归，就是处理子问题。
子问题的处理方式与root一样，只是要缩小问题规模，
所以只需要考虑root.left是什么情况，root.right是什么情况即可。
  */


/**
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/

public class Solution {
    public void Mirror(TreeNode root) {
        reverseTree(root);
    }
    
    private void reverseTree(TreeNode root){
        if (root==null){
            return;            
        }
        
        swap(root);
            
        reverseTree(root.left);
        reverseTree(root.right);
    }
    private void swap(TreeNode root){
        TreeNode node=null;
        node=root.left;
        root.left=root.right;
        root.right=node;
    }
}