
public class RecursionInterviewQuestions 
{
	public static void Demo(int n)
	{
		if(--n>0)
		{
			System.out.println("Dipali");
			Demo(n);
		}
	}
public static void main(String[] args) 
{
	Demo(10);
}
}
