package com.items.service;

import java.util.List;

import com.items.items;

public interface ItemsService {
	public void add(items items);
	public void edit (items items);
	public void delete(int itemId);
	public List<items> viewallitems();
	public 	items findItems(int itemId);

}
