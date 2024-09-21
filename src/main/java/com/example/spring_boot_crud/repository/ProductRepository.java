package com.example.spring_boot_crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring_boot_crud.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer>{

}
