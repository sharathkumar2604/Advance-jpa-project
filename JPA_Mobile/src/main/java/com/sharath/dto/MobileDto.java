package com.sharath.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name ="readAll",query=" select r from MobileDto r")
@NamedQuery(name ="readByid",query=" select r from MobileDto r where r.id=:id")
@NamedQuery(name ="readByRam",query=" select r from MobileDto r where r.ram=:ram")
@NamedQuery(name ="updatePrice",query=" update MobileDto r set r.price=:price where r.name=:name and r.ram=:ram")
@NamedQuery(name ="deleteByName",query=" delete from  MobileDto r where r.name=:name ")



public class MobileDto {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	
	private String name;
	
	private String ram;
	
	private String rom;
	
	private String color;
	
	private int price;

	public MobileDto() {
	}

	public MobileDto(String name, String ram, String rom, String color, int price) {
		this.name = name;
		this.ram = ram;
		this.rom = rom;
		this.color = color;
		this.price = price;
	}
	public int getid() {
		return id;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getRom() {
		return rom;
	}

	public void setRom(String rom) {
		this.rom = rom;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "MobileDto [id=" + id + ", name=" + name + ", ram=" + ram + ", rom=" + rom + ", color=" + color
				+ ", price=" + price + "]";
	}
	
	
	
	

}
