package com.te.mun.marshalling;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Mobile {
	private String name;
	private String color;
	private double price;

	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mobile(String name, String color, double price) {
		super();
		this.name = name;
		this.color = color;
		this.price = price;
	}
	
	@XmlElement
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@XmlElement
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	@XmlElement
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Mobile [name=" + name + ", color=" + color + ", price=" + price + "]";
	}

}
