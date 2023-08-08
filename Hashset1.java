package com.app;
import java.util.*;

public class Hashset1{
	public static void main (String[] args)
		{
			Set <String>set=new HashSet<String>();
			set.add("First");
			set.add("Second");
			set.add("Third");
			set.add("First");
			
			System.out.println ("Element of the set::"+set);
			
		}
}