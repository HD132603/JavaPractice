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
 * 1. ���� :
 * 2. �ۼ��� : 2015. 4. 13.
 * </pre>
 *
 * @author ����
 * @version 1.0.0
 * 
 */
public class CarTest {
	public static void main(String [] args){
	
		Car3  car1 = new Car3("�����ڵ���", "���׽ý�", "������", 225, 50000000);
		Car3 car2 = new Car3("����ڵ���", "K7", "���", 246);
		Car3 car3 = new Car3("�Ｚ�ڵ���", "SM7", "ȸ��");
		
		System.out.println("������� : " + car1.getCompany());
		System.out.println("�𵨸� : " + car1.getmodel());
		System.out.println("�ִ�ӵ� : " + car1.getmaxSpeed());
		System.out.println("���� : " + car1.getprice());
		
		System.out.println("������� : " + car2.getCompany());
		System.out.println("�𵨸� : " + car2.getmodel());
		System.out.println("�ִ�ӵ� : " + car2.getmaxSpeed());
		System.out.println("���� : " + car2.getprice());
		
		System.out.println("������� : " + car3.getCompany());
		System.out.println("�𵨸� : " + car3.getmodel());
		System.out.println("�ִ�ӵ� : " + car3.getmaxSpeed());
		System.out.println("���� : " + car3.getprice());
		}
	}
