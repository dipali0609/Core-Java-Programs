package Array_java;

public class Transpose_2D_Array {
public static void main(String[] args) {
	int arr[][]={{1,2,3},{4,9,2},{1,8,4}};
	System.out.println("Matrix Is::");
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			System.out.print("\t"+arr[i][j]+"\t");
		}
		System.out.println();
	}
	
	 
	 int arr1[][]=new int[3][3];
     for(int i=0;i<3;i++)
     {
    	 for(int j=0;j<3;j++)
    	 {
    		arr1[i][j]=arr[j][i];
    	 }
     }
     System.out.println("Transpose Of Matrix::");
     for(int i=0;i<3;i++)
     {
    	 for(int j=0;j<3;j++)
    	 {
    		 System.out.print("\t"+arr1[i][j]+"\t"); 
    	 }
    System.out.println();
     }
    
}
	
}

