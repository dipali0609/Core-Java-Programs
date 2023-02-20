package com.streamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamDemo {
public static void main(String[] args) 
{
List<String> animal=new ArrayList<>();
animal.add("Lion");
animal.add("Dear");
animal.add("Zebra");
animal.add("Deer");
animal.add("Monkey");

List<String>sortedList=animal.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
System.out.println(sortedList);

List<String> s1=animal.stream().sorted().collect(Collectors.toList());
System.out.println(s1);
}
}
