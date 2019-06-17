package cn.itcast.web.action;

import cn.itcast.domain.Book;
import cn.itcast.service.BookService;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;


/**
 * 表现层
 * @ClassName: BookAction
 * @Description: TODO 描述
 * @author ChenD
 * @date 2017-3-28 下午2:00:57
 */
public class BookAction extends ActionSupport implements ModelDriven<Book>{

	//创建Book对象
	private Book book = new Book();
	public Book getModel() {
		return book;
	}
	
	//注入BookService
	private BookService bookService;
	public void setBookService(BookService bookService) {
		this.bookService = bookService;
	}

	public String save() {
		
		bookService.saveBook(book);
		
		return "booksuccess";
	}

}
