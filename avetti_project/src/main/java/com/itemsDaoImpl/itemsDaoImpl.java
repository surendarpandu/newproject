package com.itemsDaoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.items.items;
import com.itemsDao.ItemsDao; 
@Repository
public class itemsDaoImpl implements ItemsDao {
	@Autowired
	private SessionFactory session;


	public void add(items items) {
		session.getCurrentSession().save(items);
		
	}

	public void edit(items items) {
		session.getCurrentSession().update(items);
		
	}
public void delete(int itemId) {
		session.getCurrentSession().delete(itemId);
		
	}

	public List viewallitems() {
		
		return (List)session.getCurrentSession().createQuery("from items").list();
	}
	
	

}
