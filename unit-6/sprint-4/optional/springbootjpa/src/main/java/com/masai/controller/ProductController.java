package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.bean.Product;
import com.masai.bean.ProductDTO;
import com.masai.exception.ProductException;
import com.masai.model.ProductService;

@RestController
public class ProductController {
@Autowired
private ProductService ps;
	@PostMapping(value ="/product")
	public ResponseEntity<Product> saveProduct(@RequestBody Product pd) throws ProductException{
		ps.registerProduct(pd);
		return new ResponseEntity<Product>(ps.registerProduct(pd),HttpStatus.CREATED);
	}
	@DeleteMapping("/deleteProduct/{productId}")
	public ResponseEntity<Product> getProductById(@PathVariable Integer productId) throws ProductException{
//		ps.deleteProductById(ProductId);
		return new ResponseEntity<Product>(ps.deleteProductById(productId),HttpStatus.ACCEPTED);
	}
	@PostMapping(value="/updateProduct")
 public ResponseEntity<Product> updateProduct(@RequestBody Product product) throws ProductException{
	 return new ResponseEntity<Product>(ps.updateProdcut(product),HttpStatus.ACCEPTED);
 }
	
	@GetMapping("/getAllProduct")
	public ResponseEntity<List<Product>> getAllProduct() throws ProductException{
		return new ResponseEntity<List<Product>>(ps.getAllProducts(),HttpStatus.OK);
}
	@GetMapping("/getProduct/{category}")
	public ResponseEntity<List<Product>> getProductByCategory(@PathVariable String category) throws ProductException{
		return new ResponseEntity<List<Product>>(ps.getsProductByCategory(category),HttpStatus.OK);
		
}
	@GetMapping("/getProductDTO")
	public ResponseEntity<List<ProductDTO>> getProductDTO() throws ProductException{
		return new ResponseEntity<>(ps.getProductNameQtyPrice(),HttpStatus.ACCEPTED);
		
	}
}
