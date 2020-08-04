package com.alticart.inventories.model;

import java.util.List;

import com.alticart.inventories.entities.InventoriesEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InventoriesListModel {

	private String responseCode;
	private String responseMsg;
	private List<InventoriesModel> stockInfo;
}
