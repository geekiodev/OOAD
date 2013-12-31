package com.chpt1.one.enums;

public enum Builder {
	FENDER("Fender"), 
	MARTIN("Martin"), 
	GIBSON("Gibson"), 
	COLLINGS("Collings"), 
	OLSON("Olson"), 
	RYAN("Ryan"), 
	PRS("PRS"), 
	ANY("Any");
	
	String value;
	
	private Builder(String value)
	{
		this.value = value;
	}
	
	public String toString()
	{
		return value;
		/*
		switch(this)
		{
		case FENDER: 
			return "Fender";
		case MARTIN:
			return "Martin";
		case GIBSON:
			return "Gibson";
		case COLLINGS:
			return "Collings";
		case OLSON:
			return "Olson";
		case RYAN:
			return "Ryan";
		case PRS:
			return "PRS";
			
		}
		*/
	}
}
