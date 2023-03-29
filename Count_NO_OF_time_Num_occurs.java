package streamAPI;

import java.util.*;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Count_NO_OF_time_Num_occurs 
{
public static void main(String[] args) 
{
List<Integer> list=Arrays.asList(2,5,7,8,2,9,5,3);
Map<Integer, Long> output = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
output.forEach((key,value)->{System.out.println(key+"-"+value);});
}
}
