package com.bookapp.service;
import java.util.*;

import com.bookapp.model.Book;

public interface BookService {
	
 List<Book> getAllBooks();
 List<Book> getAllAuthor(String author);
 List<Book> getAllCategory(String category);
 Book getBookById(int id);
}
