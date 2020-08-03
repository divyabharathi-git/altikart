package com.alticart.inventories.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alticart.inventories.entities.InventoriesEntity;
import com.alticart.inventories.model.InventoriesModel;

public interface InventoriesRepository extends JpaRepository<InventoriesEntity, Integer> {
	List<InventoriesEntity> findAll();
}
