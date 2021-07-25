package ch02_6_type_casting;

public class PromotionExample {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
//		자동타입변환 : 값의 허용 범위가 큰 타입 = 작은 타입 
//			byte(1)<short(2)<int(4)<long(8)<float(4)<double(8)
//		                  (long < float) == true ?
		int   iv = 999999999;
		long  lv = 999999999999999999L;
		float fv = 99999999999999999999999999999999999999.0f;
		
//		정수(int = byte) 자동 타입 변환
		byte byteValue = 10;
		int  intValue  = byteValue;
		
//		정수(int = char) 자동타입 변환
		char charValue = 'A';
		intValue = charValue;
		System.out.println(intValue);
		
//		정수(char = byte) 자동타입 변환(X)
//		charValue = byteValue; "char"은 음수를 포함하지 않는다.
		
//		실수타입<-정수타입 자동 타입 변환
		long longValue 	 = 1000000000L;		                   
		float floatValue = longValue; // 1.0e9f
		System.out.println(floatValue);
		
//		System.out.printf("e-value : %e\n", floatValue);
//		System.out.printf("f-value : %f\n", floatValue);
		
		
//		강제(명시적)타입변환
	}
}
