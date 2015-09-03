package org.dimgio.abstractclass;

public class SmartPhoneTest {

	public static void main(String[] args) {
		Galaxy g = new Galaxy("갤럭시 S6", "삼성", 650000);
		IPhone i = new IPhone("iPhone6", "애플", 700000);
		
		i.turnOn();
		i.pay();
		i.useSpecialFunction();
		i.turnOff();
		
		g.turnOn();
		g.pay();
		g.useSpecialFunction();
		g.turnOff();

	}

}
