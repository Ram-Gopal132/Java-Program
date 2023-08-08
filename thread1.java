package com.app;
class MyThread extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println ("i="+i+"Current thred"+Thread.currentThread().getName());
		}
	}
}

public class thread1
{
	public static void main (String[] args) 
		
		{
			System.out.println ("In main method.........."  +Thread.currentThread().getName());
			MyThread obj=new MyThread();
			obj.start();
}
}