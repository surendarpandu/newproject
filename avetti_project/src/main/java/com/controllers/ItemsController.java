package com.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.items.items;
import com.items.service.ItemsService;
public class ItemsController {
	@Autowired
 private ItemsService itemsservice;
	@RequestMapping("/index")
public String setupFrom(Map<String,Object>map){
	items items=new items();
	map.put("items", items);
	map.put("itemslist", itemsservice.viewallitems());
	return "items";
}
	@RequestMapping(value="/items.do",method=RequestMethod.POST)
public String doActions	(@ModelAttribute items items,BindingResult result,@RequestParam String action,Map<String,Object>map){
		items itemsResult=new items();
return "items";	
}
}