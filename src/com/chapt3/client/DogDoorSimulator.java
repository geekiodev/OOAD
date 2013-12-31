package com.chapt3.client;

import com.chapt3.*;
import java.util.*;

public class DogDoorSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DogDoor door = new DogDoor();
		Remote remote = new Remote(door);
		
		System.out.println("Fido barks to go outside...");
		remote.pressButton();
		System.out.println("\nFido has gone outside...");
		//remote.pressButton();
		System.out.println("\nFido is all done...");
		//remote.pressButton();
		//System.out.println("\nFido's back inside...");
		//remote.pressButton();
		
		try
		{
			Thread.currentThread().sleep(6000);
		}
		catch(InterruptedException ex)
		{
			System.out.println("Error: " + ex.getMessage());
		}
		
		System.out.println("\n...Fido is stuck outside...");
		
		System.out.println("\nFido barks to go back inside...");
		remote.pressButton();
		System.out.println("\nFido's back inside...");
	}
}
