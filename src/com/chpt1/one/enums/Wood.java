package com.chpt1.one.enums;

public enum Wood {
	INDIAN_ROSEWOOD("Indian Rosewood"),
	BRAZILIAN_ROSEWOOD("Brazilian Rosewood"),
	MAHOGANY("Mahogany"),
	MAPLE("Maple"),
	COCOBOLO("Cocobolo"),
	CEDAR("Cedar"),
	ADIRONDACK("Adirondack"),
	ALDER("Alder"),
	SITKA("Sitka");
	
	String value;
	
	private Wood(String value)
	{
		this.value = value;
	}
	
	public String toString()
	{
		return value;
	}

}
