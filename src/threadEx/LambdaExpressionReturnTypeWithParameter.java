
package threadEx;
interface Addition2{
    int add(int i,int j);
}

/*class AddClass implements Addition{
      public void add(){
             System.out.println("Add function");
     }
}*/
public class LambdaExpressionReturnTypeWithParameter {
	
		       public static void main(String args[]){   
		            /* AddClass ob=new AddClass ();
		             ob.add(); 
		             */
//		    	  	   Addition2 aob=(i,j)->{  //functional interface , funtcion with no arg and no return type
//		    		  int sum=i+j;
//		    	  		   return sum;
//		    	   };
//		    	   aob.add(4,6);
//		    	   System.out.println("sum="+aob.add(9, 5));
		    	   
		    	   Addition2 aob=(i,j)->i+j;
		    	   int a=aob.add(9, 5);
		    	   System.out.println("sum="+a);
		    	   
		    	   Runnable rob=()->{
		    		   System.out.println("inside run ");
		    	   };
		    	   Thread tob=new Thread(rob);
		    	   tob.start();
		       }
		}

