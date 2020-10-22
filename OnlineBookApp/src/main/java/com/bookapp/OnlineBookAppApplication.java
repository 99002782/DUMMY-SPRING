package com.bookapp;

import java.awt.print.Book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.bookapp.service.BookService;

@SpringBootApplication
public class OnlineBookAppApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(OnlineBookAppApplication.class, args);
	}
   @Autowired
   BookService bookService;
	
    @Autowired
    ApplicationContext context;
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		bookService.getAllBooks().forEach(System.out::println);
		bookService.getAllAuthor("manasa").forEach(System.out::println);
		bookService.getAllCategory("Tech").forEach(System.out::println);
	   


		


	}

}
