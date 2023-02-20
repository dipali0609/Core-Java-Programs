package collection_framework;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileDeom {

	public static void main(String[] args) throws IOException{
		// creating file output stream
		FileOutputStream msg=null;
		String data="We are learning java";
		try
		{
			msg=new FileOutputStream("java.txt");
			//using write() method
			msg.write(data.getBytes());
			//using the flush()	method
			msg.flush();
			msg.close();
		
			
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}

	}

}