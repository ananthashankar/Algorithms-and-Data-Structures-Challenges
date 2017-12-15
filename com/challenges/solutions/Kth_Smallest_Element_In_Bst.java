package com.challenges.solutions;

import java.util.LinkedList;
import java.util.Stack;

/**
 * Created by Anantha on 12/14/17.
 */
public class Kth_Smallest_Element_In_Bst {

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

  // Recursive approach could also be

    public int kthSmallest(TreeNode root, int k) {
        if (root == null) {
            return -1;
        }

        Stack<TreeNode> s = new Stack<TreeNode>();

        TreeNode n = root;

        while (!s.isEmpty() || n != null) {
            if (n != null) {
                s.push(n);
                n = n.left;
            } else {
                n = s.pop();
                if (k == 1) {
                    return n.val;
                }
                k--;
                n = n.right;
            }
        }
        return -1;
    }

    LinkedList<Integer> tree =  new LinkedList<>();

    public int kthSmallest2(TreeNode root, int k) {
        if(root!=null){
            inOrd(root);
            while (k>1) {
                k--;
                tree.remove();
            }
            int res = tree.getFirst();
            tree.clear();
            return res;
        }
        return -1;
    }

    public void inOrd(TreeNode root){
        if(root!=null){
            inOrd(root.left);
            tree.add(root.val);
            inOrd(root.right);
        }
    }

}
