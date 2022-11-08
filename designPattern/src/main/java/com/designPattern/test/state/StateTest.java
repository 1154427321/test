package com.designPattern.test.state;

import cn.hutool.core.util.RandomUtil;
import com.designPattern.test.state.states.*;

public class StateTest {

    public static void main(String[] args) {
        Order order = new Order();
        System.out.println(order);

        //修改状态并执行
        order.setState(new PayState());
        order.doActive();
        System.out.println(order);

        //修改状态并执行
        order.setState(new TransportState());
        order.doActive();
        System.out.println(order);

        //修改状态并执行
        order.setState(new SignState());
        order.doActive();
        System.out.println(order);

        //修改状态并执行
        order.setState(new CommentState());
        order.doActive();
        System.out.println(order);

        //根据随机数确定下一种状态
        if (RandomUtil.randomInt() % 2 == 1) {
            order.setState(new SuccessState());
        } else {
            order.setState(new FailState());
        }
        order.doActive();
        System.out.println(order);
    }
}
