package com.Store;

import java.util.ArrayList; 
import java.util.Collections;
import java.util.Iterator; 
import java.util.List;

public class ProductCatalog implements Iterable<Product> { 
	private List<Product> products;
	public ProductCatalog() { 
		this.products = new ArrayList<>();
		}
	public void addProduct(Product product) {
		products.add(product); 
		}
	public void sortProductsByName() {
		Collections.sort(products, new ProductNameComparator());
		}
	public void sortProductsByPrice() {
		Collections.sort(products);
		}
	public Iterator<Product> iterator() {
		return products.iterator();
	}
	private static class ProductNameComparator implements Comparator<Product> {
		 public int compare(Product p1, Product p2) {
			 return p1.getName().compareTo(p2.getName()); 
			 }
	}
	public static void main(String[] args) {
		ProductCatalog catalog = new ProductCatalog();
		catalog.addProduct(new Product("Laptop", 999.99, 10));
		catalog.addProduct(new Product("Smartphone", 699.99, 20));
		catalog.addProduct(new Product("Tablet", 399.99, 15)); 
		System.out.println("Products sorted by price:"); 
		catalog.sortProductsByPrice();
		for (Product product : catalog) {
			System.out.println(product);
		}
		System.out.println("\nProducts sorted by name:");
		catalog.sortProductsByName();
		for (Product product : catalog) {
			System.out.println(product);
		}
		try {
			Product clonedProduct = (Product) catalog.iterator().next().clone();
			System.out.println("\nCloned product:");
			System.out.println(clonedProduct);
			}
		catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}