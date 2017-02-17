package com.zookeeper;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ZookeeperServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZookeeperServerApplication.class, args);
	}
	
	@Value("${testdata}")
    private String name;

    public String getHelloMessage() {
        return "Hello " + this.name;
    }
	
    @GetMapping("/hello")
	    public String run() {
	        System.out.println(getHelloMessage());
	        return getHelloMessage();
	    }
	 
	  
	 
}
