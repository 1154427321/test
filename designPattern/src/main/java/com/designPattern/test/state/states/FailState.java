package com.designPattern.test.state.states;

import com.designPattern.test.state.Order;

/**
 * 订单失败状态
 */
public class FailState implements OrderState{

    @Override
    public void doActive(Order order) {
        System.out.println("用户不满意，退货！！！");
    }

    @Override
    public String toString() {
        return "订单失败状态";
    }
}
