package cn.luink.algorithm.nowcoder.BM;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.function.Function;
import java.util.stream.Collectors;

public class BM23二叉树的前序遍历 {


      public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
        public TreeNode(int val) {
          this.val = val;
        }
      }

    public class Solution {
        /**
         * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
         *
         *
         * @param root TreeNode类
         * @return int整型一维数组
         */
        public int[] preorderTraversal (TreeNode root) {
            // write code here
            if(root==null){
                return new int[0];
            }
            Stack<TreeNode> stack = new Stack<>();
            List<Integer> list = new ArrayList<>();
            stack.push(root);
            while (!stack.isEmpty()){
                root = stack.pop();
                list.add(root.val);
                if (root.right!=null) {
                    stack.push(root.right);
                }
                if (root.left!=null) {
                    stack.push(root.left);
                }
            }
            int[] res = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                res[i] = list.get(i);
            }
            return res;
        }
    }
}
