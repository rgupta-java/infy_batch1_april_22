package com.a.basics_oo;

public class Shirt {
	private int id;
	private String brand;
	private double price;
	private int size;
	
	public Shirt(int id, String brand, double price, int size) {
		this.id = id;
		this.brand = brand;
		this.price = price;
		this.size = size;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return "Shirt [id=" + id + ", brand=" + brand + ", price=" + price + ", size=" + size + "]";
	}
	
	
	
}
