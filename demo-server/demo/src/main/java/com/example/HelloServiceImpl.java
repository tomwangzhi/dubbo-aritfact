package com.example;

import java.util.Date;

import com.alibaba.dubbo.config.annotation.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

@Service(version = "1.0.0")
public class HelloServiceImpl implements HelloService {

    @Autowired
    Environment environment;

	@Override
    public String sayHello(String name) {
        return "Hello, " + name + ", " + new Date();
    }

    @Override
    public String myName() {
        return environment.getProperty("dubbo.application.name");
    }
}