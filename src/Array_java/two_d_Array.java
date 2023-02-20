package Array_java;

public class two_d_Array 
{
public static void main(String[] args) {
	int arr[][]={{2,4,6},{ 9,2,1}};
	
	for(int i=0;i<2;i++)
	{
		for(int j=0;j<3;j++)
		{
			System.out.print("\t"+arr[i][j]+"\t");
			
		}
		System.out.println();
	}
}
}
