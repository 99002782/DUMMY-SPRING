/**
 * 
 */
package com.example.service;

import org.springframework.stereotype.Service;

/**
 * @author Training
 *
 */
@Service public class GreetServiceImpl implements GreetService {

	@Override
	public String showMessage() {
		// TODO Auto-generated method stub
		return "have a great day";
	}

	@Override
	public String welcome(String name) {
		// TODO Auto-generated method stub
		return "hello"+name.toUpperCase();
	}

	@Override
	public String printName(String name) {
		// TODO Auto-generated method stub
		 return "Hello"+name.toLowerCase();
	}

	
}
