package com.alticart.inventories.services;

import org.springframework.stereotype.Service;

import com.alticart.inventories.model.InventoriesListModel;
import com.alticart.inventories.model.InventoriesModel;
import com.alticart.inventories.model.InventoriesResponseModel;

@Service
public interface InventoryServiceI {

	InventoriesListModel getAllInventories();
	InventoriesResponseModel updateInventories(InventoriesModel inventoriesModel);
	InventoriesResponseModel addInventories(InventoriesModel inventoriesModel);

}

