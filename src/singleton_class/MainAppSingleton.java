package singleton_class;

//Singleton pattern(Core java Design pattern)

class Database{
	  static Database dobj;
	  private Database(){
		  System.out.println("By making constructor private restricting user from another class not to create an object");
	  }
	  public static Database getDatabaseObject(){
	       if(dobj==null)
	           dobj=new Database();
	       return dobj;
	  }
	   
	  public void dataBaseOperations(){
	        System.out.println("dataBaseOperations");
	  }
	  }

	public class MainAppSingleton{
	    public static void main(String args[]){
	         // Database ob=new Database(); //you should get error
	       
	    	System.out.println("Main method");
	    	Database obj=Database.getDatabaseObject();
	    	System.out.println("object of database class "+obj);
	    	obj.dataBaseOperations();
	        }
	    }