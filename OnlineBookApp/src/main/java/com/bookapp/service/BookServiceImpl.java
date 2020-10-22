package com.bookapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.bookapp.dao.BookDAO;
import com.bookapp.dao.BookDAOImpl;
import com.bookapp.model.Book;

public class BookServiceImpl implements BookService {
	@Autowired
    BookDAO bookDAo;
	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return bookDAo.getAllBooks();
	}

	@Override
	public List<Book> getAllAuthor(String author) {
		// TODO Auto-generated method stub
		return bookDAo.getAllAuthor(author);
	}

	@Override
	public List<Book> getAllCategory(String category) {
		// TODO Auto-generated method stub
		return bookDAo.getAllCategory(category);
	}

	@Override
	public Book getBookById(int id) {
		// TODO Auto-generated method stub
		return bookDAo.getBookById(id);
	}

}
