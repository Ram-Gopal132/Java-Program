package com.app;
import java.util.*;

public class CollectList
{
	public static void main (String[] args) {
		List list=new ArrayList();
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("four");
		System.out.println ("List of the element::"+list);
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println ((i+".........>"+list.get(i)));
		}
		System.out.println ("First Occurence Index::"+list.indexOf("First"));
		System.out.println ("Last Occurence Index::"+list.lastIndexOf("four"));
		
		list.remove(0); //Removing the element by index wise
		
		System.out.println (list);
		ListIterator liter=list.listIterator();
		System.out.println ("-------Forward Traversing--------");
		while(liter.hasNext())
		{
		
		System.out.println (liter.next());
		}
		
		System.out.println ("-------Backword Traversing--------");
		while(liter.hasPrevious())
		{
		
		System.out.println (liter.previous());
		}
		
		//list.clear();
		//System.out.println ("The final list"+list);
}
}