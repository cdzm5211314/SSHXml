package cn.itcast.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.itcast.dao.BookDAO;
import cn.itcast.domain.Book;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class BookDAOTest {
	
	@Autowired
	private BookDAO bookDAO;

	@Test
	public void testSave() {
		
		Book book = new Book();
		book.setName("Spring讲解");
		book.setPrice(38.87);
		
		bookDAO.save(book);
	
	}
	
	//根据书名模糊查询
	//criteria条件查询
	@Test
	public void testFindByNameLike(){
		
		List<Book> list = bookDAO.findByNameLike("spring");
		System.err.println(list);
	}

	@Test
	public void testDel() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindById() {
		fail("Not yet implemented");
	}

}
