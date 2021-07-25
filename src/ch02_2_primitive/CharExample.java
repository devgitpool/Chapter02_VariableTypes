package ch02_2_primitive;

public class CharExample {
	public static void main(String[] args) {
//		'문자' : 문자 리터럴
//		  문자 리터럴은 유니코드(2byte)로 변환되어 저장
//		 유니코드: 세계각국의 문자를 숫자로 매핑한 국제 표준 규약
		System.out.println(65);
		System.out.println((char)65); // 코드값(65) : A
		System.out.println((int)'B');
		System.out.println((int)'가');
		System.out.println((char)44033);
		System.out.println((char)44034);
		System.out.println((char)44035);
		System.out.println((char)44036);
		System.out.println((int)'뷁');
		System.out.println((char)48578);
		
		char c1 = 'A';		//문자를 직접 저장
		char c2 = 65;		//10진수로 저장
		char c3 = '\u0041';	//16진수로 저장

		System.out.println(c1); //A
		System.out.println(c2); //65? A?
		System.out.println(c3); //A
		
		char c4 = '가';
		char c5 = 44032;
		char c6 = '\uac00';
		
		System.out.println(c4); //가
		System.out.println(c5);	//가
		System.out.println(c6); //가
		
		System.out.println((char)0xAC00);
		
	}
}
