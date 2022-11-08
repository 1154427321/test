package com.designPattern.test.state.states;

import com.designPattern.test.state.Order;

/**
 * 状态模式状态接口
 */
public interface OrderState {

    void doActive(Order order);

    String toString();
}
