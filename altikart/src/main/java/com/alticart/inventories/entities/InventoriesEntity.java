package com.alticart.inventories.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "stocks")
@Setter
@Getter
public class InventoriesEntity {
	
	@Id
	private int stockNumber; 
	private String stockName;
	private Double purchasingPrice;
	private Date purchaseDate;
	private int quantity;
	
}
