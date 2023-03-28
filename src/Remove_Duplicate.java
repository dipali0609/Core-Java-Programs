import java.util.ArrayList;

public class Remove_Duplicate {

	public static void main(String[] args)
	{
	ArrayList<Integer> as=new ArrayList<>();
	as.add(2);
	as.add(5);
	as.add(4);
	as.add(5);
	as.add(4);
	as.add(5);
	System.out.println(as);
	ArrayList<Integer> newList=new ArrayList<>();
	for(Integer element:as)
	{
		if(!newList.contains(element))
		{
			newList.add(element);
		}
	}
	
	System.out.println(newList);
	}

}
