package com.items.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.items.items;
import com.items.service.ItemsService;
import com.itemsDao.ItemsDao;
import com.itemsDaoImpl.itemsDaoImpl;
@Service
public class ItemsServiceimpl implements ItemsService {
	private ItemsDao itemsDao;
 @Transactional
	public void add(items items) {
	   itemsDao.add(items);

	}
@Transactional
	public void edit(items items) {
	  itemsDao.edit(items);

	}
@Transactional
	public void delete(int itemId) {
		itemsDao.delete(itemId);

	}
@Transactional
	public List viewallitems() {
		
		return itemsDao.viewallitems();
	}

}
