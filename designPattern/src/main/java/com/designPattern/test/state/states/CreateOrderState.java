package com.designPattern.test.state.states;

import com.designPattern.test.state.Order;

/**
 * 创建订单状态
 */
public class CreateOrderState implements OrderState{
    @Override
    public void doActive(Order order) {
        System.out.println("订单创建成功，等待支付...");
    }

    @Override
    public String toString() {
        return "创建订单状态";
    }
}
