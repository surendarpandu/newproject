package com.itemsDaoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.items.items;
import com.itemsDao.ItemsDao; 
@Repository
public class itemsDaoImpl implements ItemsDao {
	@Autowired
	private SessionFactory session;
	
	
	private Session getSession(){
		return session.getCurrentSession();
	}
	


	public void add(items items) {
		session.getCurrentSession().save(items);
		
	}

	public void edit(items items) {
		session.getCurrentSession().update(items);
		
	}
public void delete(int itemId) {
		
	items items=(items)getSession().get(items.class,itemId);
	session.getCurrentSession().delete(items);
		
	}

	@SuppressWarnings("unchecked")
	public List<items> viewallitems() {
		
		return (List<items>)session.getCurrentSession().createQuery("from items").list();
	}

	public items findItems(int itemId) {
		items items=(items)getSession().get(items.class,itemId);
		return items;
	}
	
	

}
