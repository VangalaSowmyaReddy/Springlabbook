package com.capg.model;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.service.Products;

public interface ProductRepo extends JpaRepository<Products, Integer> {

}
