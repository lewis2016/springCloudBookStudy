package com.lewis.web;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lewis.bean.Book;

@Controller
@EnableAutoConfiguration
public class BookController {
@RequestMapping("/bookInfo")
@ResponseBody
	public String bookInfo() {
	Book book =new Book();
		return book.toString();
	}
	
   

}
