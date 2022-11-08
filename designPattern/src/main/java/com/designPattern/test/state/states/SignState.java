package com.designPattern.test.state.states;

import com.designPattern.test.state.Order;

/**
 * 等待签收状态
 */
public class SignState implements OrderState{
    @Override
    public void doActive(Order order) {
        System.out.println("已送达，等待签收...");
    }

    @Override
    public String toString() {
        return "等待签收状态";
    }
}
