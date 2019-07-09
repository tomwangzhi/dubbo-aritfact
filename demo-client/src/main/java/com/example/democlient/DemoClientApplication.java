package com.example.democlient;

import org.springframework.boot.SpringApplication;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.HelloService;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoClientApplication {

	@Reference(version = "1.0.0")
  	private HelloService demoService;

	public static void main(String[] args) {
		
		SpringApplication.run(DemoClientApplication.class, args);
	}
	
    @PostConstruct
    public void init() {
    	String sayHello = demoService.sayHello("world");
    	System.err.println(sayHello);
		String serverName = demoService.myName();
		System.out.println(serverName);
    }


}
