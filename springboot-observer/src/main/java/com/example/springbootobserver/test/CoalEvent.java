package com.example.springbootobserver.test;

import cn.hutool.json.JSONObject;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class CoalEvent implements ApplicationListener<MqttDataEvent> {


    @Override
    public void onApplicationEvent(MqttDataEvent event) {
        JSONObject source = (JSONObject) event.getSource();
        System.out.println("gogog:"+source);
    }
}
