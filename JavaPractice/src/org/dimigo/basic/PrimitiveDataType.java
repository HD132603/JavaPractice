package org.dimigo.basic;

public class PrimitiveDataType {
	public static void main(String[] args){
		String name = "������";
		boolean tjdquf= true;
		int age = 23;
		double hight = 161.8;
		float weight = (float) 44.3;
		char bloodtype = 'A';
		
		System.out.println("<<������������>>");
		System.out.println("�̸� " + ": " + name);
		if(tjdquf){
			System.out.println("���� : ����");
		}
		System.out.println("���� : " + age +"��");
		System.out.println("Ű : "+ hight);
		System.out.println("������ : " + weight + "kg");
		System.out.println("������ : " + bloodtype + "��");
	}

}
