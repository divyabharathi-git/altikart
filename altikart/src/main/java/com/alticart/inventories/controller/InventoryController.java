package com.alticart.inventories.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alticart.inventories.model.InventoriesListModel;
import com.alticart.inventories.model.InventoriesModel;
import com.alticart.inventories.model.InventoriesResponseModel;
import com.alticart.inventories.services.InventoryService;

@RestController
@RequestMapping("/altikart/stock")
public class InventoryController {
	
	
	@Autowired
	InventoryService inventoryService;
	
	@RequestMapping(method=RequestMethod.GET,value="/display")
	public InventoriesListModel getAllInventories()
	{
		 return inventoryService.getAllInventories();
	}
	
	@PostMapping("/create")
	public InventoriesResponseModel createInventory(@RequestBody InventoriesModel inventoriesModel)
	{
		System.out.println(inventoriesModel.getStockNumber());
		return inventoryService.addInventories(inventoriesModel);
	}
	
	@PutMapping("/update")
	public InventoriesResponseModel updateInventory(@RequestBody InventoriesModel inventoriesModel)
	{
		return inventoryService.updateInventories(inventoriesModel);
	} 

}
