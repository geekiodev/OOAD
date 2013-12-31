package com.chpt1.one;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.chpt1.one.enums.Builder;
import com.chpt1.one.enums.Type;
import com.chpt1.one.enums.Wood;

public class GuitarSpec {
	private Builder builder;
	private String model;
	private Type type;
	private Wood backWood;
	private Wood topWood;
	private int numStrings;
	
	public GuitarSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood, int numStrings) 
	{
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
		this.numStrings = numStrings;
	}

	public Builder getBuilder() {
		return builder;
	}

	public String getModel() {
		return model;
	}

	public Type getType() {
		return type;
	}

	public Wood getBackWood() {
		return backWood;
	}

	public Wood getTopWood() {
		return topWood;
	}

	public int getNumStrings() {
		return numStrings;
	}
	
	public boolean matches(GuitarSpec searchSpecs)
	{
		// ignore serial number since that's unique
		// ignore price since that's unique
		
		Builder builder = this.getBuilder();
		if(builder != searchSpecs.getBuilder())
		{
			return false;
		}
		
		String model = this.getModel().toLowerCase();
		if((model != null) && (!model.equals("")) && (!model.equals(searchSpecs.getModel().toLowerCase())))
		{
			return false;
		}
		
		Type type = this.getType();
		if(type != searchSpecs.getType())
		{
			return false;
		}
		
		Wood backWood = this.getBackWood();
		if(backWood != searchSpecs.getBackWood())
		{
			return false;
		}
		
		Wood topWood = this.getTopWood();
		if(topWood != searchSpecs.getTopWood())
		{
			return false;
		}
		
		int numStrings = this.getNumStrings();
		if(numStrings != searchSpecs.getNumStrings())
		{
			return false;
		}
		
		return true;
	}
	
}
