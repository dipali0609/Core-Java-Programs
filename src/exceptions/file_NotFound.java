package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class file_NotFound {
public static void main(String[] args)
{
try
{
	File f=new File("abc.txt");
	FileReader fr=new FileReader(f);
	
}
catch(FileNotFoundException e)
{
	System.out.println(e);
}
}
}
