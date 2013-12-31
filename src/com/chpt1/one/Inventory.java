package com.chpt1.one;

import java.util.*;

import com.chpt1.one.enums.Builder;
import com.chpt1.one.enums.Type;
import com.chpt1.one.enums.Wood;

public class Inventory {
	private List guitars;
	
	public Inventory()
	{
		guitars = new LinkedList<Guitar>();
	}
	
	public void addGuitar(String serialNumber, double price, GuitarSpec guitarSpec) //Builder builder, String model, Type type, Wood backWood, Wood topWood)
	{
		Guitar guitar = new Guitar(serialNumber, price, guitarSpec); //, builder, model, type, backWood, topWood);
		
		guitars.add(guitar);
	}
	
	public Guitar getGuitar(String serialNumber)
	{
		for(Iterator i = guitars.iterator(); i.hasNext();)
		{
			Guitar guitar = (Guitar)i.next();
			
			if(guitar.getSerialNumber().equals(serialNumber))
			{
				return guitar;
			}
		}
		
		return null;
	}
	
	public List<Guitar> search(GuitarSpec searchSpecs)
	{
		Processing.message("Searching...");
		//return searchSpec.search(guitars); //, searchSpec);
		List<Guitar> matchingGuitars = new LinkedList<Guitar>();
		
		
		for(Iterator i = guitars.iterator(); i.hasNext();)
		{
			Guitar guitar = (Guitar)i.next();
			GuitarSpec guitarSpec = guitar.getSpec();
			
			if(guitar.getSpec().matches(searchSpecs))
			{
				matchingGuitars.add(guitar);
			}
		}
		
		
		return matchingGuitars;
	}
}

class Processing
{
	public static void message(String msg)
	{
		System.out.println(msg);
	}
}
