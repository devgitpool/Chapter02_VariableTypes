package ch02_test;

import java.util.Scanner;

public class Testing {
	public static void main(String[] args) {
		/* 이름: 김자바
		 * 나이: 25
		 * 전화: 010-123-456
		 */
//		String name = "김자바";
//		int age = 25;
//		String tel1 = "010", tel2 = "123", tel3 = "4567";
//		
//		System.out.println("이름: " + name);
//		System.out.print("나이: " + age + "\n");
//		System.out.printf("전화: %2$s-%1$s-%3$s\n", tel1, tel2, tel3);
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("첫번째 수:");
//		String strNum1 = sc.nextLine();
//		
//		System.out.print("두번째 수:");
//		String strNum2 = sc.nextLine();
//		
//		int num1 = Integer.parseInt(strNum1);
//		int num2 = Integer.parseInt(strNum2);		
//		
//		int result = num1 + num2;
//		System.out.println("덧셈 결과:" + result);
		
		/* [필수 정보 입력]
		 * 1. 이름: 
		 * 2. 주민번호 앞 6자리:
		 * 3. 전화번호: 
		 */

// test
		String name = "";
		String socialSecurityNumber = "";
		String mobile = "";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[필수 정보 입력]");
		
		System.out.print("1. 이름: ");
		name = sc.nextLine();
		
		System.out.print("2. 주민번호 앞 6자리: ");
		socialSecurityNumber = sc.nextLine();
		
		System.out.print("3. 전화번호: ");
		mobile = sc.nextLine();
		
		System.out.println();
		
		System.out.println("[입력된 내용]");
		System.out.println(name);
		System.out.println(socialSecurityNumber);
		System.out.println(mobile);
		
		sc.close();
	}
}
