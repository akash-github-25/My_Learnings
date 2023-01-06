package com.que3;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.masai.utility.EMUtil;
@Repository
public class ProductRepoImpl implements ProductRepo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean insertProductDetails(Product product) {
		// TODO Auto-generated method stub
		EntityManager em= EMUtil.provideEntityManager();
		em.getTransaction().begin();
		em.persist(product);
		em.getTransaction().commit();
		return true;
		
	}

	@Override
	public List<Product> getAllProductDetails() {
		// TODO Auto-generated method stub
		EntityManager em= EMUtil.provideEntityManager();
		String jpql="from Product";
		Query s=em.createQuery(jpql);
		List<Product> c=s.getResultList();
		
		return c;
	}

	@Override
	public Product findProduct(int productId) {
		// TODO Auto-generated method stub
		EntityManager em= EMUtil.provideEntityManager();
		Product p1=em.find(Product.class, productId);
		return p1;
//		return null;
	}

	@Override
	public List<Product> getProductInPriceRange(int fromPrice, int toPrice) {
		// TODO Auto-generated method stub
		EntityManager em= EMUtil.provideEntityManager();
		String jpql="from Product where price between :fp and :tp";
		
		Query s=em.createQuery(jpql);
		s.setParameter(fromPrice, ":fp");
		s.setParameter(toPrice, ":tp");
		List<Product> c=s.getResultList();
		
		return c;
	}

}
