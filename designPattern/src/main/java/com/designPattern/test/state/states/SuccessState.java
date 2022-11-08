package com.designPattern.test.state.states;

import com.designPattern.test.state.Order;

/**
 * 订单成功状态
 */
public class SuccessState implements OrderState{
    @Override
    public void doActive(Order order) {
        System.out.println("评论成功,订单结束！");
    }

    @Override
    public String toString() {
        return "订单成功状态";
    }
}
