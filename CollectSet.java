package com.app;

import java.util.*;

public class CollectSet

{
	public static void main (String[] args) 
	{
		
		Collection c=new HashSet();
		c.add("First");
		c.add("Second");
		c.add("Third");
		c.add("Fourth");
		
		System.out.println ("The Elements of collection::"+c);
		//If element found then true otherwise false
		System.out.println ("In first elements in exist collection::"+c.contains("First"));
		// c.clear();
		
		System.out.println ("Is Current collection empty::"+c.isEmpty());
		
		Iterator itr=c.iterator();
		
		while(itr.hasNext())
		{
			System.out.println (itr.next());
		}
		c.remove("Second");
		System.out.println ("The collection is::"+c);
		System.out.println (" Number of Elements::"+c.size());
	}
}
