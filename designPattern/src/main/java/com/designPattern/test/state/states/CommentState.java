package com.designPattern.test.state.states;

import com.designPattern.test.state.Order;

/**
 * 等待评论状态
 */
public class CommentState implements OrderState{
    @Override
    public void doActive(Order order) {
        System.out.println("签收成功，等待评论...");
    }

    @Override
    public String toString() {
        return "等待评论状态";
    }
}
