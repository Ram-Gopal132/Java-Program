package com.app;
import java.util.*;

public class Waiter implements Runnable
	{
		Message message;
		public Waiter(Message _message)
		{
			message=_message;
		}
	
	
	public void run()
	{
		synchronized(message)
		{
		
			try
			{
				System.out.println ("Waiter thread entry time::"+new Date());
				System.out.println ("I will after 3 seconds::"+new Date());
				Thread.sleep(3000);
				System.out.println ("Wait.......Fired"+new Date());
				message.wait();
				System.out.println ("wait over at ..."+new Date());
			}
			catch(Exception e)
			{
				
			}
	}
	}
	}