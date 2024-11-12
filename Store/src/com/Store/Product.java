package com.Store;

public class Product implements Comparable<Product>, Cloneable { 
	private String name; 
	private double price;
	private int stock;
	public Product(String name, double price, int stock) {
		this.name = name;
		this.price = price; 
		this.stock = stock;
		}
	public String getName() {
		return name;
		} 
	public double getPrice(){
		return price;
		}
	public int getStock() { 
		return stock;
	}
	public int compareTo(Product other) {
		return Double.compare(this.price, other.price);
	}
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	public String toString() {
		return "Product{" + "name='" + name + '\'' + ", price=" + price + ", stock=" + stock + '}';
	}
}