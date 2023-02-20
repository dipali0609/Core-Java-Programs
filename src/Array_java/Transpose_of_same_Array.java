package Array_java;

public class Transpose_of_same_Array
{
public static void main(String[] args) {
	int arr[][]={{5,6,7},{1,2,3},{9,8,7}};
	
	System.out.println("Matrix::");
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			System.out.print("\t"+arr[i][j]+"\t");
		}
		System.out.println();
	}
	
	
	int temp;
	System.out.println("Transpose Matrix::");
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			if(i<=j)
			{
				temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
	}
	
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			System.out.print("\t"+arr[i][j]+"\t");
		}
		System.out.println();
	}
	

	
}
}
