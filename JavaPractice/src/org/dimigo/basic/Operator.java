package org.dimigo.basic;

public class Operator {

	public static void main(String[] args) {
		int a = 9;
		int b = 10;
		double h = 5.8;
		double s1 = (a+b)*h/2;
		
		int c = 9;
		double d = 5.4;
		double s2 = c*d;
		
		
		
		System.out.println("<< ���� ���� �� >>");
		System.out.println("��ٸ��� ���� : " + s1);
		System.out.println("����纯�� ���� : " + s2);
		
		System.out.println("��ٸ����� ����纯�� ���� " + (s1-s2) + " �� Ů�ϴ�.");

	}

}
