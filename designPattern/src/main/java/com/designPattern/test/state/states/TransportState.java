package com.designPattern.test.state.states;

import com.designPattern.test.state.Order;

/**
 * 运输状态
 */
public class TransportState implements OrderState{
    @Override
    public void doActive(Order order) {
        System.out.println("已发货，正在运输...");
    }

    @Override
    public String toString() {
        return "运输状态";
    }
}
