package com.masai.bean;

public class ProductDTO {
	private String productName;
	private Integer quantity;
	private Double price;
	
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public ProductDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductDTO(String productName, Integer quantity, Double price) {
		super();
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
