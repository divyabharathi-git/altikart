package com.alticart.inventories.model;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InventoriesModel {

	private int stockNumber; 
	private String stockName;
	private Double purchasingPrice;
	private Date purchaseDate;
	private int quantity;
	
	
	
	
}
