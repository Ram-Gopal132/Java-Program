package com.app;

import java.util.*;

class Room{
	public String toString()
	{
		return "Room class Object";
		
	}
}

class Chamber

{
	public String toString()
	{
		return "Chamber class Object";
	}
}

public class Collect3
{
	public static void main (String[] args) {
		Room room=new Room();
		Chamber chamber=new Chamber();
		//Collection <Room>c=new HashSet<Room>();
		Collection c=new HashSet();
		c.add(room);
		c.add(chamber);
		c.add("String to Objecg");
		
		System.out.println ("Collecton of Object::"+c);
}
}