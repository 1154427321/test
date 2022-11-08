package com.designPattern.test.state.states;

import com.designPattern.test.state.Order;

/**
 * 支付状态
 */
public class PayState implements OrderState{
    @Override
    public void doActive(Order order) {
        System.out.println("支付成功，等待发货...");
    }

    @Override
    public String toString() {
        return "支付状态";
    }
}
