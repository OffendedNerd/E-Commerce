package com.example.demo.dao;

import com.example.demo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface ProductRepository extends JpaRepository<Product,Long> {

}
