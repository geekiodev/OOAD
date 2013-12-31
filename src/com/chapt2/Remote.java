package com.chapt2;

import java.util.Timer;
import java.util.TimerTask;

public class Remote {
	private DogDoor door;
	
	public Remote(DogDoor door)
	{
		this.door = door;
	}
	
	public void pressButton()
	{
		System.out.println("Pressing the remote control button...");
		
		if(door.isOpen())
		{
			door.close();
		}
		else
		{
			door.open();
		}
		
		final Timer timer = new Timer();
		timer.schedule(new TimerTask(){
			public void run(){
				door.close("automatically.");
				timer.cancel();
			}
		}, 5000);
	}
}
