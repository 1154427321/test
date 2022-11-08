package cn.luink.algorithm.leecode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 817. 链表组件
 * <p>
 * 示例 1：
 * <p>
 * 输入: head = [0,1,2,3], nums = [0,1,3]
 * 输出: 2
 * 解释: 链表中,0 和 1 是相连接的，且 nums 中不包含 2，所以 [0, 1] 是 nums 的一个组件，同理 [3] 也是一个组件，故返回 2。
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * <p>
 * 输入: head = [0,1,2,3,4], nums = [0,3,1,4]
 * 输出: 2
 * 解释: 链表中，0 和 1 是相连接的，3 和 4 是相连接的，所以 [0, 1] 和 [3, 4] 是两个组件，故返回 2。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/linked-list-components
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class 链表组件 {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    /**
     * 示例 1：
     *  输入: head = [0,1,2,3], nums = [0,1,3]
     *  输出: 2
     *  解释: 链表中,0 和 1 是相连接的，且 nums 中不包含 2，所以 [0, 1] 是 nums 的一个组件，同理 [3] 也是一个组件，故返回 2。
     *  示例 2：
     *  输入: head = [0,1,2,3,4], nums = [0,3,1,4]
     *  输出: 2
     *  解释: 链表中，0 和 1 是相连接的，3 和 4 是相连接的，所以 [0, 1] 和 [3, 4] 是两个组件，故返回 2。
     * @param head
     * @param nums
     * @return
     */
    public static int numComponents(ListNode head, int[] nums) {
        //转为集合并去重
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        //组件计数
        int count = 0;
        //在集合flag
        boolean flag = false;
        //遍历链表
        while (head!=null){
            //如果set集合包含当前位则认为是一个组件
            if (set.contains(head.val)){
                //如果当前flag为false则计数+，不在
                if (!flag) {
                    flag = true;
                    count++;
                }
            }else {
                flag = false;
            }

            head = head.next;
        }

        return count;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(0, new ListNode(1, new ListNode(2, new ListNode(3))));
        int[] nums = {0, 1, 3};
        numComponents(listNode,nums);
    }

}
