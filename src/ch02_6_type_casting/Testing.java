package ch02_6_type_casting;

public class Testing {
	public static void main(String[] args) {
		int intValue = 10;
		char charValue = 'A';
		System.out.println(charValue);
		
		double doubleValue = 5.7;
		String strValue = "A";
		System.out.println(strValue);
		
		System.out.println((double)intValue);
		System.out.println((byte)intValue);
		System.out.println((int)doubleValue);
//		타입 : 기본형, 참조형
//		System.out.println((char)strValue);
		
	}
}
