package ch02_2_primitive;

public class StringExample {
	public static void main(String[] args) {
		/**
		 * String은 기본타입이 아니다. 클래스 타입이다.
		 * 기본타입:boolean,byte,char,short,int,float,double
		 */
//		'': 컴파일러가 문자 리터럴로 인식    'c'
//		"": 컴파일러가 문자열 리터럴로 인식 "circle"
		char[] ch = new char[]{'a','b','c'};
//		System.out.println(ch[0]);
		for(int i=0; i<ch.length; i++)
			System.out.print(ch[i]);
		System.out.println();
		
		System.out.printf("char[] : %s\n", String.valueOf(ch));
		
		String str = "abc";
		System.out.printf("String : %s\n", str);
		
		String name = "홍길동";
		String job = "프로그래머";
		System.out.println(name);
		System.out.println(job);
		
	}
}
