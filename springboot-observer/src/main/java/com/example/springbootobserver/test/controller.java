package com.example.springbootobserver.test;

import cn.hutool.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class controller {

    @Autowired
    ApplicationContext applicationContext;

    @GetMapping("observer")
    public void observer(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.putOnce("test","mqtt");
        applicationContext.publishEvent(new MqttDataEvent(jsonObject));
    };
}
