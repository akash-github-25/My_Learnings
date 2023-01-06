package com.masai.model;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.bean.Product;
import com.masai.bean.ProductDTO;
import com.masai.exception.ProductException;
import com.masai.repository.ProductRepo;
@Service
public class ProductServiceImpl implements ProductService{

	
@Autowired
private ProductRepo pr;
	@Override
	public Product registerProduct(Product p) throws ProductException {
		// TODO Auto-generated method stub
//		pr.save(p);
		return pr.save(p);
	}

	@Override
	public List<Product> getAllProducts() throws ProductException {
		// TODO Auto-generated method stub
		
		List<Product> v= pr.findAll();
		if(v!=null) {
			return v;
		}else {
			throw new ProductException("NO data present");
		}
	}

	@Override
	public Product updateProdcut(Product p) throws ProductException {
		// TODO Auto-generated method stub
		Optional<Product> j=pr.findById(p.getProductId());
		if(j.isPresent()) {
		Product p1=pr.save(p);
		return p1;
		}else {
			throw new ProductException("cannot be updated");
		}
		
	}

	@Override
	public Product deleteProductById(Integer pid) throws ProductException {
		// TODO Auto-generated method stub
		Optional<Product> k=pr.findById(pid);
		Product c=k.get();
		if(c!=null) {
		pr.delete(c);
		}else {
			throw new ProductException("cannot be deleted");
		}
		return null;
	}

	@Override
	public List<Product> getsProductByCategory(String category) throws ProductException {
		// TODO Auto-generated method stub
      List<Product> b=pr.findByCategory(category);
     if(b!=null) {
    	 return b;
     }else {
		throw new ProductException("No product with this category");
     }
	}

	@Override
	public List<ProductDTO> getProductNameQtyPrice() throws ProductException {
		// TODO Auto-generated method stub
		return pr.getProductNameQuantityPrice();
	
	}

}
