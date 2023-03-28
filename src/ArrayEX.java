
public class ArrayEX {

	public static void main(String[] args)
	{
		System.out.println("Multi dimentioal Array copy shallow cloning same memeory location");
		int arr[][]={{1,2,3,4},{5,6,7,8}};
		int arr1[][]=arr.clone();
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				System.out.println(arr[i][j]);
			}
			
		}
		
	}

}
