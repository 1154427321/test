package com.example.springbootobserver.test;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class MqttDataEvent extends ApplicationEvent {




    public MqttDataEvent(Object source) {
        super(source);
    }
}
