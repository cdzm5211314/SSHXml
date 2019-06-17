package cn.itcast.service;

import cn.itcast.dao.BookDAO;
import cn.itcast.domain.Book;

/**
 * 业务层  完成业务的逻辑代码
 * @ClassName: BookService
 * @Description: TODO 描述
 * @author ChenD
 * @date 2017-3-28 下午1:31:45
 */
public class BookService {
	
	//注入BookDAO
	private BookDAO bookDAO;
	public void setBookDAO(BookDAO bookDAO) {
		this.bookDAO = bookDAO;
	}

	public void saveBook(Book book){
		
			bookDAO.save(book);
	}
	
	
}
