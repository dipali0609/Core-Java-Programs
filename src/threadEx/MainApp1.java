package threadEx;
	class Helloo extends Thread{
		public void run() {
			
			for(int i=1;i<=5;i++) {
				//System.out.println(this.isAlive());
			System.out.println("display method "+Thread.currentThread());
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		}
	}

public class MainApp1
{
public static void main(String[] args) throws InterruptedException 
{
	System.out.println(Thread.currentThread()); //JVM
	Hello ob=new Hello();
	ob.setName("firstThread");
	 Hello ob1=new Hello();
	ob1.setName("secondThread");
	System.out.println("before start First Thread isAlive "+ob.isAlive());
    ob.start();
    System.out.println("before join start First Thread isAlive "+ob.isAlive());
     ob.join();
     System.out.println("after start First Thread isAlive "+ob.isAlive());
	ob1.start();
}
}

//package com.edu;
//
//class Hello extends Thread{
//	public void run() {
//		for(int i=1;i<=5;i++) {
//			//System.out.println(this.isAlive());
//		System.out.println("display method "+Thread.currentThread());
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		}
//	}
//}
//public class MainApp {
//	public static void main(String[] args) throws InterruptedException {
//		System.out.println(Thread.currentThread()); //JVM
//		Hello ob=new Hello();
//		ob.setName("firstThread");
//		 Hello ob1=new Hello();
//		ob1.setName("secondThread");
//		System.out.println("before start First Thread isAlive "+ob.isAlive());
//	    ob.start();
//	    System.out.println("before join start First Thread isAlive "+ob.isAlive());
//	     ob.join();
//	     System.out.println("after start First Thread isAlive "+ob.isAlive());
//		ob1.start();
//		}
//	}