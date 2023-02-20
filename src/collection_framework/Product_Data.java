package collection_framework;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

class Product_D
{
	int productId;
	String productName;
	int productPrice;
	public void productInput()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the productId:");
		productId=sc.nextInt();
		System.out.println("enter the productName:");
		productName=sc.next();
		System.out.println("enter the productPrice:");
		productPrice=sc.nextInt();
		
	}

	
	public void display()
	{
		System.out.println(productId+"\t"+productName+"\t"+productPrice);
	}
}
	
	class ProductId implements Comparator<Product_D>
	{

		@Override
		public int compare(Product_D e1, Product_D e2) {
			// TODO Auto-generated method stub
			if(e1.productId==e2.productId)
				return 0;
			else if(e1.productId>e2.productId)
			return 1;
			else
				return -1;
		}
		
	}
	
	class ProductPrice implements Comparator<Product_D>
	{

		@Override
		public int compare(Product_D o1, Product_D o2) {
			// TODO Auto-generated method stub
			if(o1.productPrice==o2.productPrice)
			return 0;
			else if(o1.productPrice>o1.productPrice)
			return 1;
			else
				return -1;
		}
		
	}
	
	class ProductName implements Comparator<Product_D>
	{

		@Override
		public int compare(Product_D o1, Product_D o2) {
			// TODO Auto-generated method stub
			return o1.productName.compareTo(o2.productName);
		}
		
	}
		public class Product_Data
		{	
		public static void main(String[] args) {
	LinkedList<Product_D> V=new LinkedList<>();
	
	//Vector<Product_D> V=new Vector<>();
	
	
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the limit of data:");
  int n=sc.nextInt();
  
  for(int i=0;i<n;i++)
  {
	  Product_D ob=new Product_D();
	  ob.productInput();
	  V.add(ob);
  }
  System.out.println("before sort");
  Iterator<Product_D> I=V.iterator();
  System.out.println("ID\tPName\tPrice");
  while(I.hasNext())
  {
	  Product_D Product=I.next();
	  Product.display();
	
  }
  
  
  
//sort by productID
  ProductId esort=new ProductId();
	Collections.sort(V,esort);
	System.out.println("After sort By ProductID:");
   
  Iterator<Product_D> I1=V.iterator();
  System.out.println("ID\tPName\tPrice");
  while(I1.hasNext())
  {
	  Product_D Product=I1.next();
	  Product.display();
	
  }
  
//sort by productprice
  ProductPrice psort=new ProductPrice();
	Collections.sort(V,psort);
	System.out.println("After sort By ProductPrice:");
   
  Iterator<Product_D> I2=V.iterator();
  System.out.println("ID\tPName\tPrice");
  while(I2.hasNext())
  {
	  Product_D Product=I2.next();
	  Product.display();
	
  }
  
  
//sort by productName
  ProductName psort1=new ProductName();
	Collections.sort(V,psort1);
	System.out.println("After sort By ProductName");
   
  Iterator<Product_D> I3=V.iterator();
  System.out.println("ID\tPName\tPrice");
  while(I3.hasNext())
  {
	  Product_D Product=I3.next();
	  Product.display();
	
  }
}


}
