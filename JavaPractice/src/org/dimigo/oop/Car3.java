/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 		|_ Car
 *  
 * 1. 개요 :
 * 2. 작성일 : 2015. 4. 13.
 * </pre>
 *
 * @author 병학
 * @version 1.0.0
 * 
 */
public class Car3 {
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	private int price;
	
	public Car3(String company, String model, String color, int maxSpeed, int price) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.price = price;
	}
	
	public Car3(String company, String model, String color, int maxSpeed){
		this(company, model, color, maxSpeed, 0);
	}
	
	public Car3(String company, String model, String color){
		this(company, model , color, 0 );
	}
	
	
	public String getCompany(){
		return company;
	}
	
	public String getmodel() {
		return model;
	}
	
	public String getcolor() {
		return color;
	}
	
	public int getmaxSpeed(){
		return maxSpeed;
	}
	
	public int getprice() {
		return price;
	}
	
	public void setCompany(String newcompany) {
		company = newcompany;
	}
	
	public void setModel(String newmodel) {
		model = newmodel;
	}
	
	public void setColor(String newcolor) {
		color = newcolor;
	}
	
	public void setMaxSpeed(int newmaxspeed) {
		maxSpeed = newmaxspeed;
	}
	
	public void setPrice(int newprice) {
		price = newprice;
	}

}
