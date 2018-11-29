package com.items.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.items.items;
import com.items.service.ItemsService;
import com.itemsDao.ItemsDao;
@Service
public class ItemsServiceimpl implements ItemsService {
	@Autowired
	private ItemsDao itemsDao;
 public ItemsDao getItemsDao() {
		return itemsDao;
	}
	public void setItemsDao(ItemsDao itemsDao) {
		this.itemsDao = itemsDao;
	}
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
	public List<items> viewallitems() {
		
		return itemsDao.viewallitems();
	}
	@Transactional
public items findItems(int itemId) {
	
	return itemsDao.findItems(itemId);
}

}
