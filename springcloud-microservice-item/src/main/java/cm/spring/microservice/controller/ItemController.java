package cm.spring.microservice.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import cm.spring.microservice.pojo.Item;
import cm.spring.microservice.service.ItemService;

//@Controller
//@ResponseBody
@RestController
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	@GetMapping(value="/item/{id}")
    public Item getItemById(@PathVariable(name="id") Long id) {
		
		return itemService.queryItemById(id);
		
	}
}
