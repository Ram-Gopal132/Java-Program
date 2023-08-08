package com.app;
import java.util.*;

class Room extends Object
{
	int length;
	int breadth;
		public  Room(int l,int b)
		{
			length=l;
			breadth=b;
		}
		public String toString()
			{
				return"(Object of length="+length+" Breadth="+breadth+")";
			}
}

public class Colltct2
{
	public static void main (String[] args) {
		Room obj=new Room(10,25);
		Room obj1=new Room(18,95);
		Room obj2=new Room(19,85);
		Room obj3=new Room(20,45);
		Room obj4=new Room(22,35);
		
		Collection c=new HashSet();
		
		c.add(obj);
		c.add(obj1);
		c.add(obj2);
		c.add(obj3);
		c.add(obj4);
		
		Iterator itr=c.iterator();
		
		while(itr.hasNext())
		{
			System.out.println (itr.next());
		}		
}
}