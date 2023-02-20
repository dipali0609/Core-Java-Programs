package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

class readwritefile
{
	void readfile() throws FileNotFoundException
	{
		FileInputStream fs=new FileInputStream("d:/abc.txt");
	}
	void writefile() throws FileNotFoundException
	{
		FileOutputStream fo=new FileOutputStream("d:/abc.txt");
	}
}
public class Throws_Keyword 
{
public static void main(String[] args) 
{
readwritefile ob=new readwritefile();
try
{
	ob.readfile();// it will shows the exception file not found exception
}
catch(FileNotFoundException e)
{
	System.out.println(e);
}

try
{
	ob.writefile();	//this aoutomatically create file in D drive and it will not shows the exception 
}
catch(FileNotFoundException e)
{
	System.out.println(e);
}

}
}
