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
   // List<Integer> result = new ArrayList<>();
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        
//      Creating two stacks to store the values
        Stack<TreeNode> st1 = new Stack<>();
        Stack<TreeNode> st2 = new Stack<>();
       // Created our result arraylist, where we will return our final answer
        List<Integer> res = new ArrayList<>();
        
//       // we will put all the elements in our stack until reach the leaf node
        // of both the root1 & root2 tree. First left, then right
        while(root1 != null || root2 != null || !st1.empty() || !st2.empty()){
            // filling our stack with all left values of root1 tree
            while(root1 != null){ // and root1 will act as current pointer  
                st1.push(root1);
                root1 = root1.left;
            }// filling our stack with all left values of root2 tree
            while(root2 != null){ // and root2 will act as current pointer 
                st2.push(root2);
                root2 = root2.left;
            }
            // either stack2 is empty we will pop all vaues from stack1 straight away but,
            // if stack2 is not empty then we will get their peek values
            // of both the stack1 & stack2 and compare them
            // if stack1 value is less then, add it into our result & move to right
            if(st2.empty() || (!st1.empty() && st1.peek().val <= st2.peek().val)){
                root1 = st1.pop();
                res.add(root1.val);
                root1 = root1.right;
            }
            // either stack1 is empty we will pop all vaues from stack2 straight away but,
            // if stack1 is not empty then we will get their peek values
            // of both the stack1 & stack2 and compare them
            // if stack2 value is less then, add it into our result & move to right
            else{
                root2 = st2.pop();
                res.add(root2.val);
                root2 = root2.right;
            }
        }
  return res;

//        if(root1 == null && root2 == null)
//             return result;

//         helper(root1);
//         helper(root2);
//         Collections.sort(result);

//         return result;
//     }


//     private void helper(TreeNode root){
//         if(root == null)
//             return;
//         else {
//             result.add(root.val);
//             helper(root.left);
//             helper(root.right);
//         }
    }
}