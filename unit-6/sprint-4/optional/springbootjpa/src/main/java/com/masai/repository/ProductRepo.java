package com.masai.repository;

import java.util.List;

//import javax.persistence.Query;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.masai.bean.Product;
import com.masai.bean.ProductDTO;

public interface ProductRepo extends JpaRepository<Product, Integer> {
public List<Product> findByCategory(String category);

@Query("select new com.masai.bean.ProductDTO(productName,quantity,price) from Product")
public List<ProductDTO> getProductNameQuantityPrice();
}
