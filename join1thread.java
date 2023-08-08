package com.app;	
class MyTask implements Runnable
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println ("i=" +i+"Current thread" +Thread.currentThread().getName);
		}
	}
}

public class join1thread
{
	public static void main (String[] args)throws Exception
		{
			MyTask task=new MyTask();
			
		}
}