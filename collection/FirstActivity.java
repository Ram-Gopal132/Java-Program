package com.app;

import java.util.*;

public class FirstActivity

{
	public static void main (String[] args) 
	{
		
		Collection c=new HashSet();
		c.add("First");
		c.add("Second");
		c.add("Third");
		c.add("Fourth");
		
		System.out.println ("The Elements of collection::"+c);
	}
}