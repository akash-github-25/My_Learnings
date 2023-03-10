package com.que5;

public class Main {
	private int productId;
	private String productName;
	private int quantity;
	private int price;

	@Override
	public String toString() {
		return "Main [productId=" + productId + ", productName=" + productName + ", quantity=" + quantity + ", price="
				+ price + "]";
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Main() {
		super();
	}

	public Main(int productId, String productName, int quantity, int price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
