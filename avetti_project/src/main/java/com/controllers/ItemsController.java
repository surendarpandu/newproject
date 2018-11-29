package com.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.items.items;
import com.items.service.ItemsService;
@Controller
@RequestMapping(value="/items")
public class ItemsController {
	@Autowired
  ItemsService itemsservice;
	
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public ModelAndView list(){
		ModelAndView model= new ModelAndView("items/list");
		List<items> list= itemsservice.viewallitems();
		model.addObject("list",list);
				return model;
	}
	
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public ModelAndView add(){
		ModelAndView model= new ModelAndView("items/form");
		items items=new items();
		model.addObject("itemsform",items);
				return model;
	}
	
	
	@RequestMapping(value="/edit",method=RequestMethod.POST)
	public ModelAndView edit(@ModelAttribute("itemId")items items){
		ModelAndView model= new ModelAndView("items/form");
		itemsservice.edit(items);
		model.addObject("itemsform",items);
				return new ModelAndView ("redirect:/items/list");
		
}
	@RequestMapping(value="/update/{itemId}",method=RequestMethod.GET)
	public ModelAndView update(@PathVariable("itemId")int itemId){
		ModelAndView model = new ModelAndView("items/form");
		items items=itemsservice.findItems(itemId);
		model.addObject("itemsform",items);
				return  model;
	}
	@RequestMapping(value="/delete",method=RequestMethod.POST)
	public ModelAndView edit(@PathVariable("itemId")int itemsId){
		itemsservice.delete(itemsId);
				return new ModelAndView ("redirect:/items/list");
	
}
}
