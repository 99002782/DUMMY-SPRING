package com.example;

import org.springframework.stereotype.Service;

@Service
public class GreetServicesImpl implements GreetServices {
	
	public String greet(String name) {
        // TODO Auto-generated method stub
        return "Welcome "+ name;
}
}
