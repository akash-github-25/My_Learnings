package com.que3;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
private ProductRepo pr;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean addProduct(Product product) {
		// TODO Auto-generated method stub
		return pr.insertProductDetails(product);
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return pr.getAllProductDetails();
	}

	@Override
	public Product getProductById(int productId) throws ProductException {
		// TODO Auto-generated method stub
		return pr.findProduct(productId);
	}

	@Override
	public List<Product> getProductsBetweenPrice(int fromPrice, int toPrice) throws ProductException {
		// TODO Auto-generated method stub
		return pr.getProductInPriceRange(fromPrice, toPrice);
	}

}
