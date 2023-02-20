package collection_framework;
import java.util.ArrayList;
class Book
{
	int book_id;
	String book_Name;
	String book_Author;
	String book_Publisher;
	int quantity;
	Book(int book_id, String book_Name, String book_Author, String book_Publisher, int quantity)
	{
		this.book_id=book_id;
		this.book_Name=book_Name;
		this.book_Author=book_Author;
		this.book_Publisher=book_Publisher;
		this.quantity=quantity;
	}
	
	
//	@Override
//	public String toString() {
//		return "Book [book_id=" + book_id + ", book_Name=" + book_Name + ", book_Author=" + book_Author
//				+ ", book_Publisher=" + book_Publisher + ", quantity=" + quantity + ", getClass()=" + getClass()
//				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
//	}
	
	
}
public class Book1 
{	
public static void main(String[] args) {
	ArrayList<Book> l1=new ArrayList<Book>();
	System.out.println("Id\tBook_Name\t Book_Author\tBook_Publisher\tquantity");
	Book b1=new Book(1,"Mrityunjaya", "Shivaji Sawant ","ABC",200);
	Book b2=new Book(2,"Panipat    ", "Vishwas Patil  ","XYZ",400);
	Book b3=new Book(3,"Musafir    ", "Achyut Godbole ","PQR",100);
	Book b4=new Book(4,"Shala      ", "Milind Bokil   ","DFG",2000);
	Book b5=new Book(5,"Yugandhar  ", "Shivaji Sawant ","VBN",900);
	l1.add(b1);
	l1.add(b2);
	l1.add(b3);
	l1.add(b4);
	l1.add(b5);
	
	
	java.util.Iterator<Book> I=l1.iterator();
	while(I.hasNext())
	{
		Book book=I.next();
		//System.out.println(book.book_id+"\t"+book.book_Name+"\t "+book.book_Author+"\t "+book.book_Publisher+"\t "+book.quantity);
	System.out.println(book);		
	}
	
//	for(Book b:l1)
//	{
//		System.out.println(b.book_id+" "+b.book_Name+" "+b.book_Author+" "+b.book_Publisher+" "+b.quantity);
//	}	
	
}
}
