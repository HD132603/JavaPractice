package org.dimigo.basic;

public class Promotion {

	public static void main(String[] args) {
		int i1 = 1700000;
		byte i2 = 3;
		int i3 = 1500;
		Long i4 = (long)i1 * (long)12 * (long)i2 * (long)i3;
		
		System.out.println("<<" + "��̺��� ���� �ΰǺ�" + ">>");
		System.out.println("�� ��� �޿� : " + String.format("%,d", i1) + "��");
		System.out.println("���� �� ���� �� : " + String.format("%,d", i2) + "��");
		System.out.println("���� �� : " + String.format("%,d", i3) + "��");
		
		System.out.println("���� �ΰǺ� : "+ String.format("%,d", i4) + "��");

	}

}
