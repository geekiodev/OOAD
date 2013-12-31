package com.chpt1.one.client;

import java.util.List;

import com.chpt1.one.*;
import com.chpt1.one.enums.Builder;
import com.chpt1.one.enums.Type;
import com.chpt1.one.enums.Wood;

public class FindGuitarTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// set up Rick's guitar inventory
		Inventory inventory = new Inventory();
		
		initializeInventory(inventory);
		
		GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 6);
		
		List<Guitar> matchingGuitars = inventory.search(whatErinLikes);
		System.out.println("==================================================");
		
		if(!matchingGuitars.isEmpty())
		{
			System.out.println("Erin, you might like these guitars:");
			for(Guitar guitar : matchingGuitars)
			{
				GuitarSpec guitarSpec = guitar.getSpec();
				
				System.out.println("We have a " + 
						guitarSpec.getBuilder() + " " + 
						guitarSpec.getModel() + " " + 
						guitarSpec.getType() + " guitar:\n" + 
						guitarSpec.getBackWood() + " back and sides,\n" + 
						guitarSpec.getTopWood() + " top.\n" +
						guitarSpec.getNumStrings() + " Strings\n" + "You can have it for only $" + 
						guitar.getPrice() + "!"); 
				
				System.out.println("==================================================");
			}
		}
		else
		{
			System.out.println("Sorry, Erin, we have nothing for you");
		}
	}

	private static void initializeInventory(Inventory inventory)
	{
		// add guitars to the inventory
		GuitarSpec guitarSpec1 = new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 6);
		GuitarSpec guitarSpec2 = new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 6);
		
		inventory.addGuitar("V95693", 1499.95, guitarSpec1); // Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
		inventory.addGuitar("V9512", 1549.95, guitarSpec2); // Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
	}
}
