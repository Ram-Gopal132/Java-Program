package com.app;
class MyTask implements Runnable
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println ("i="+i+ " Current Thread  " +Thread.currentThread().getName());
			
		}
	}
}

public class thread2
{
	public static void main (String[] args)
		 {
		 	MyTask task=new MyTask();
		 	Thread t=new Thread(task);
		 	t.setName("india");
		 	t.start();
	}
}