package com.designPattern.test.state;


import cn.hutool.core.lang.UUID;
import cn.hutool.core.util.IdUtil;
import com.designPattern.test.state.states.CreateOrderState;
import com.designPattern.test.state.states.OrderState;

import java.io.Serializable;
import java.util.Random;

/**
 * 状态模式的context
 */
public class Order implements Serializable {

    private OrderState state;

    private String orderNum;

    @Override
    public String toString() {
        return "orderNum:" + orderNum+"\nstate:" + state.toString()+"\n";
    }

    public Order(){
        this.state = new CreateOrderState();
        this.orderNum = IdUtil.fastSimpleUUID();
    }

    void doActive(){
        state.doActive(this);
    }

    public OrderState getState() {
        return state;
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }
}
