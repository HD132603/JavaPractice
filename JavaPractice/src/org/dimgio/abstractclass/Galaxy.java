package org.dimgio.abstractclass;

public class Galaxy extends SmartPhone{
	
	public Galaxy(String model, String company, int price){
		super(model, company, price);
	}
	
	public Galaxy(){
		super();
	}
	
	public void pay() {
		System.out.println("삼성 페이로 결제합니다.");
	}
	
	public void useSpecialFunction(){
		System.out.println("무선충전 기능을 이용합니다.");
	}

}
