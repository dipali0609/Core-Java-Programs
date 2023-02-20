package threadEx;

interface Addition1{
    void add(int i,int j);
}

/*class AddClass implements Addition{
      public void add(){
             System.out.println("Add function");
     }
}*/
public class LambdaExpressionWithParameter {
	
	       public static void main(String args[]){   
	            /* AddClass ob=new AddClass ();
	             ob.add(); 
	             */
	    	  	   Addition1 aob=(i,j)->{  //functional interface , funtcion with no arg and no return type
	    		  int sum=i+j;
	    	  		   System.out.println("Add function:"+sum);
	    	   };
	    	   aob.add(4,6);
	    	   
	    	   Runnable rob=()->{
	    		   System.out.println("inside run ");
	    	   };
	    	   Thread tob=new Thread(rob);
	    	   tob.start();
	       }
	}


