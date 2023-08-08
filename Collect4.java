package com.app;
import java.util.*;

public class Collect4
{
	public static void main (String[] args)
		{
			List<Integer> list=new ArrayList<Integer>();
			list.add(1);
			list.add(2);
			list.add(3);
			list.add(4);
			
			System.out.println ("Data in Collection::"+list);
			
			//----------Unboxing--------
			
			int i=list.get(0);  //object oriented type to primitive type is known as unboxing.
			
			System.out.println (("First Integer::"+i));
		}
}