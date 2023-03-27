package cn.luink.algorithm.test;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Test01 {
    public static void main(String[] args) {
        String aa = "fdsf";
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.add(2);
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        Queue<Integer> queue = new PriorityQueue<>();
        queue.offer(1);


    }
}
