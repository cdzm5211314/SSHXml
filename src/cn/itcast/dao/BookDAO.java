package cn.itcast.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.itcast.domain.Book;

/**
 * 数据层 完成数据的增删改查
 * 
 * @ClassName: BookDAO
 * @Description: TODO 描述
 * @author ChenD
 * @date 2017-3-28 上午10:23:54
 */
public class BookDAO extends HibernateDaoSupport {

	// 注入sessionFactory构造HibernateTemplate对象

	public void save(Book book) {

		this.getHibernateTemplate().save(book);
	}

	public void del(Book book) {

		this.getHibernateTemplate().delete(book);
	}

	public void update(Book book) {

		this.getHibernateTemplate().update(book);
	}

	public List<Book> findAll() {

		return this.getHibernateTemplate().find("from Book");
	}
	
	public Book findById(Integer id){
		
		return this.getHibernateTemplate().get(Book.class,id);
	}
	
	//根据书名来模糊查询
	public List<Book> findByNameLike(String name){
		
//		System.err.println(this.getClass());
//		String hql ="from Book where name like ?";
//		return this.getHibernateTemplate().find(hql, "%"+name+"%");
		
		//条件查询criteria--->不需要写sql,生成sql
//		DetachedCriteria criteria = DetachedCriteria.forClass(Book.class);//select * from book; 
		//添加条件
//		criteria.add(Restrictions.ilike("name","%"+name+"%"));//where name like ?;
//		return this.getHibernateTemplate().findByCriteria(criteria);
		
		// 命名查询namedQuery,将语句配置, 便于维护
//		return this.getHibernateTemplate().findByNamedQuery("Book.findByNameLike", "%"+name+"%");
		return this.getHibernateTemplate().findByNamedQuery("Book.findByNameLikeSQL","%"+name+"%" );
		
		
		
	}
	
	
}
