package com.example.springbootobserver.test;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class WindEvent {

    @EventListener
    public void windprocesser(MqttDataEvent event) {
        Object source = event.getSource();
        System.out.println("2222");
    }
}
