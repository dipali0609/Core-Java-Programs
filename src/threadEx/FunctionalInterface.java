package threadEx;

	interface Addition{
	    void add();
	}

	/*class AddClass implements Addition{
	      public void add(){
	             System.out.println("Add function");
	     }
	}*/

	public class FunctionalInterface 
	{
	       public static void main(String args[]){   
	            /* AddClass ob=new AddClass ();
	             ob.add(); 
	             */
	    	  	   Addition aob=()->{  //functional interface , funtcion with no arg and no return type
	    		   System.out.println("Add function");
	    	   };
	    	   aob.add();
	    	   
	    	   Runnable rob=()->{
	    		   System.out.println("inside run ");
	    	   };
	    	   Thread tob=new Thread(rob);
	    	   tob.start();
	       }
	}
