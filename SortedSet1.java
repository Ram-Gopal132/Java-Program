package com.app;

import java.util.*;

class Room implements Comparable<Room>
{
	int breadth;
	int length;
	public Room(int l, int b)
	{
		length=l;
		breadth=b;
	}
	public String toSring()
	{
		return "(Object of length="+length+"Breadth="+breadth+")";
	}
	public int compareTo(Room nextObject)
	{
		int value=this.length-nextObject.length;
		if(value<0)
		{
			return -1;
		}
		else if(value>0)
		{
			return 1;
		}
		else
			return 0;
	}
}

public class SortedSet1
{
	public static void main (String[] args)
		{
			Room obj=new Room(10,45);
			Room obj1=new Room(5,85);
			Room obj2=new Room(15,35);
			Room obj3=new Room(13,45);
			
			SortedSet<Room> set=new HashSet<Room>();
			set.add(obj);
			set.add(obj1);
			set.add(obj2);
			set.add(obj3);
			
			Iterator itr=set.iterator();
			while(itr.hasNext())
				System.out.println (itr.next());
			
		}
}