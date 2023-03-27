package cn.luink.algorithm.nowcoder.BM;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BM24二叉树的中序遍历 {

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
         * @param root TreeNode类
         * @return int整型一维数组
         */
        public int[] inorderTraversal(TreeNode root) {
            // write code here
            if (root == null)
                return new int[0];

            Stack<TreeNode> stack = new Stack<>();
            List<Integer> list = new ArrayList<>();

            while (root != null || !stack.isEmpty()) {
                while (root != null) {
                    stack.push(root);
                    root = root.left;
                }
                TreeNode pop = stack.pop();
                list.add(pop.val);
                root = pop.right;
            }
            int[] res = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                res[i] = list.get(i);
            }
            return res;
        }


    }
}


