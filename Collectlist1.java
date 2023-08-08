package com.app;

import java.util.*;

public class Collectlist1

{
	public static void main (String[] args) 
	{
		List list=new ArrayList();
		list.add("First");
		list.add("Second");
		list.add("Third");
		list.add("First");
		list.add("Fourth");
		list.add("First");
		
		System.out.println ("Collection of the list::"+list);
		
		System.out.println (list);
	
	}
}