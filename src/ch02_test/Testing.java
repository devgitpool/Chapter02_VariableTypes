package ch02_test;

import java.util.Scanner;

public class Testing {
	public static void main(String[] args) {
		/* �̸�: ���ڹ�
		 * ����: 25
		 * ��ȭ: 010-123-456
		 */
//		String name = "���ڹ�";
//		int age = 25;
//		String tel1 = "010", tel2 = "123", tel3 = "4567";
//		
//		System.out.println("�̸�: " + name);
//		System.out.print("����: " + age + "\n");
//		System.out.printf("��ȭ: %2$s-%1$s-%3$s\n", tel1, tel2, tel3);
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("ù��° ��:");
//		String strNum1 = sc.nextLine();
//		
//		System.out.print("�ι�° ��:");
//		String strNum2 = sc.nextLine();
//		
//		int num1 = Integer.parseInt(strNum1);
//		int num2 = Integer.parseInt(strNum2);		
//		
//		int result = num1 + num2;
//		System.out.println("���� ���:" + result);
		
		/* [�ʼ� ���� �Է�]
		 * 1. �̸�: 
		 * 2. �ֹι�ȣ �� 6�ڸ�:
		 * 3. ��ȭ��ȣ: 
		 */

// test
		String name = "";
		String socialSecurityNumber = "";
		String mobile = "";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[�ʼ� ���� �Է�]");
		
		System.out.print("1. �̸�: ");
		name = sc.nextLine();
		
		System.out.print("2. �ֹι�ȣ �� 6�ڸ�: ");
		socialSecurityNumber = sc.nextLine();
		
		System.out.print("3. ��ȭ��ȣ: ");
		mobile = sc.nextLine();
		
		System.out.println();
		
		System.out.println("[�Էµ� ����]");
		System.out.println(name);
		System.out.println(socialSecurityNumber);
		System.out.println(mobile);
		
		sc.close();
	}
}
