package cn.luink.algorithm.nowcoder;

import java.util.Objects;
import java.util.Stack;

public class 反转链表 {

    public static void main(String[] args) {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        one.next=two;two.next = three;
        ListNode listNode = reverseList(one);
        aaa(listNode);
    }
    //栈实现
//    public static ListNode byStack(ListNode head) {
//        Stack<Integer> stack = new Stack<>();
//        while (true){
//            if (head.next == null) {
//                break;
//            }
//            head
//        }
//
//    }
    //递归实现
    public static ListNode reverseList(ListNode head) {
        //如果next为空，则到达尾节点
        if (head == null || head.next==null) {
            return head;
        }
        ListNode thisNode = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return thisNode;
    }
    //用于输出
    public static void aaa(ListNode listNode){
        if (listNode == null) {
            return;
        }
        System.out.println(listNode.val);
        aaa(listNode.next);
    }


}
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}