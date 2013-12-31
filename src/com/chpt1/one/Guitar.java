package com.chpt1.one;

import com.chpt1.one.enums.Builder;
import com.chpt1.one.enums.Type;
import com.chpt1.one.enums.Wood;

public class Guitar {
	private String serialNumber;
	private double price;
	private GuitarSpec spec;
	
	public Guitar(String serialNumber, double price, GuitarSpec spec) 
	{
		this.serialNumber = serialNumber;
		this.price = price;
		this.spec = spec; 
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double newPrice) {
		this.price = newPrice;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public GuitarSpec getSpec() {
		return spec;
	}

}
