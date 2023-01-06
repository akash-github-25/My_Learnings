package com.masai.model;

import java.util.List;

import com.masai.bean.Product;
import com.masai.bean.ProductDTO;
import com.masai.exception.ProductException;

public interface ProductService {
	public Product registerProduct(Product p)throws ProductException;
	public List<Product> getAllProducts()throws ProductException;
	public Product updateProdcut(Product p)throws ProductException;
	public Product deleteProductById(Integer pid)throws ProductException;
	public List<Product> getsProductByCategory(String category)throws
	ProductException;
	public List<ProductDTO> getProductNameQtyPrice() throws
	ProductException;
}
