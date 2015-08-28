package org.dimigo.inheritance;

public class SmartPhone {
	
	public String model;
	public String company;
	public int price;
	
	public SmartPhone(){
		super();
	}
	
	public SmartPhone(String model, String company, int price){
		this.model = model;
		this.company = company;
		this.price = price;
	}
	
	public void turnOn() {
		System.out.println(model + "의 전원을 켭니다.");
	}
	
	public void turnOff(){
		System.out.println(model + "의 전원을 끕니다.");
	}
	
	public void pay() {
		
	}
	
	public void useSpecialFunction(){
		
		
	}

	
	
	@Override
	public String toString() {
		return "SmartPhone [model=" + model + ", company=" + company + ", price=" + price + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
