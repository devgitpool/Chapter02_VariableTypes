package ch02_6_type_casting;

public class CastingExample {
	public static void main(String[] args) {
//		확장변환(Promotion) : int-->double 손실X 자동형변환
//		축소변환(Demotion)	  : double-->int 손실O 강제형변환
		
//		작은 허용 범위 타입 = (작은타입)큰 허용 범위 타입 
//		(작은타입)으로 변환하여 강제로 나눠서 저장한다.
		
//		캐스팅 연산자 (자료형) 괄호 사용
		int intValue = 127;
		intValue = 1000000;
		byte byteValue = (byte)intValue; // 강제(명시적) 타입 변환
		System.out.println(byteValue);	 // 64 출력
		
//		(char)<--int 강제형변환 이유: 문자를 출력하기 위해
		System.out.println(65);
		System.out.println((char)65);
		System.out.printf("Integer 출력: %d\n", 65);
		System.out.printf("Char    출력: %c\n", 65);
		intValue = 66;
		char charValue = (char)byteValue;
		System.out.println(charValue); // 64'@'가 출력
		
//		byte,short,int,long<--(double, float)
//		소수점 이하 부분은 버려진다. 정수 부분만 저장
		double doubleValue = 3.14;
		intValue = (int)doubleValue; // 3
		System.out.println(intValue);
		doubleValue = 3.74;
		System.out.println(doubleValue);
		intValue = (int)doubleValue;
		System.out.println(intValue);
		
//		실무에서 타입 캐스팅을 사용하는 사례
//		- 문자열에 있는 숫자를 계산하고 싶을 때
//		- String str = (String)(3:숫자)
//		- 명시적(외부클래스api/인터페이스)으로 정해진 자료형으로 
//		    변환이 필요할 때
		

	}
}
