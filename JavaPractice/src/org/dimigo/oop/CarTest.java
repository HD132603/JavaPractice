/**
 * 
 */
package org.dimigo.oop;

import org.omg.Messaging.SyncScopeHelper;

/**
 * <pre>
 * org.dimigo.oop
 * 		|_ CarTest
 *  
 * 1. 개요 :
 * 2. 작성일 : 2015. 4. 13.
 * </pre>
 *
 * @author 병학
 * @version 1.0.0
 * 
 */
public class CarTest {
	public static void main(String [] args){
	
		Car3  car1 = new Car3("현대자동차", "제네시스", "검정색", 225, 50000000);
		Car3 car2 = new Car3("기아자동차", "K7", "흰색", 246);
		Car3 car3 = new Car3("삼성자동차", "SM7", "회색");
		
		System.out.println("제조사명 : " + car1.getCompany());
		System.out.println("모델명 : " + car1.getmodel());
		System.out.println("최대속도 : " + car1.getmaxSpeed());
		System.out.println("가격 : " + car1.getprice());
		
		System.out.println("제조사명 : " + car2.getCompany());
		System.out.println("모델명 : " + car2.getmodel());
		System.out.println("최대속도 : " + car2.getmaxSpeed());
		System.out.println("가격 : " + car2.getprice());
		
		System.out.println("제조사명 : " + car3.getCompany());
		System.out.println("모델명 : " + car3.getmodel());
		System.out.println("최대속도 : " + car3.getmaxSpeed());
		System.out.println("가격 : " + car3.getprice());
		}
	}
