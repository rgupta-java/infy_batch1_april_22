package com.bookapp.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import com.bookapp.dao.BookDao;
import com.bookapp.dao.BookDaoImpl;
@ExtendWith(MockitoExtension.class)
class BookServiceImplTestUsingAnnotations {

	@Mock
	private BookDao dao;
	
//	@Spy
//	private BookDaoImpl dao;
	
	@InjectMocks
	private BookServiceImpl bookService;
	
	@BeforeEach
	void setUp() throws Exception {
		List<String> books=Arrays.asList("java","rich dad poor dad","java adv");
		when(dao.getBooks()).thenReturn(books);
	}
	
	@Test
	void getBooksAllJavaBookCountIsTwo() {
		assertEquals(2, bookService.getBooks("java").size());
	}

	@AfterEach
	void tearDown() throws Exception {
		dao=null;
		bookService=null;
	}

	

}
