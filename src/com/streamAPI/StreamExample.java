package com.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Product
{
	int id;
	String name;
	float price;
	public Product(int id,String name,float price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
		
	}
	
}
public class StreamExample 
{
public static void main(String[] args) {
	List<Product> p1=new ArrayList<>();
	
	p1.add(new Product(1,"Dell",80000));
	p1.add(new Product(2,"Apple",450000));
	p1.add(new Product(3,"Acer",30000));
	p1.add(new Product(4,"Hp",50000));
	p1.add(new Product(5,"IPhone",90000));
	
	List<Float>ProductPrice=p1.stream().filter(p->p.price>30000)
			.map(p->p.price)
			.collect(Collectors.toList());
	System.out.println(ProductPrice);
	
	p1.stream().filter(product->product.price<=30000).
	forEach(product->System.out.println(product.name));
	
}
}
