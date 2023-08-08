package com.app;
public class WaitNotifier
{
	public static void main (String[] args)
		{
			Message resource = new Message();
		
			Notifier ntask = new Notifier(resource);
			Waiter wtask = new Waiter(resource);
			Thread tw=new Thread(wtask);
			Thread tn=new Thread(ntask);
			tw.start();
			tn.start();
		}
}