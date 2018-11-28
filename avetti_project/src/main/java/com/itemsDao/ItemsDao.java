package com.itemsDao;

import java.util.List;

import com.items.items;

public interface ItemsDao {
	public void add(items items);
	public void edit (items items);
	public void delete(int itemId);
	public List viewallitems();

}
