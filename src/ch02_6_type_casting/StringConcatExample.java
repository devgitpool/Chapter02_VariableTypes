package ch02_6_type_casting;

public class StringConcatExample {
	public static void main(String[] args) {
//		[ + 연산 ]
//		- 덧셈 연산 		: 숫자 + 숫자
//		- 문자열 결합 연산	: 숫자 + 문자열 , 문자열 + 숫자
//		                  -> 문자열로 자동 변환
		String str = "";	
		
		int value 	= 1 + 2 +  3;
			value 	=   3   +  3;
			value 	=       6;
//					   숫	   숫  				
			str   	= 1 + 2  +  "3";
			str		=   3    +  "3";
			str		=       "33";
			
			str		= 1 + "2" +  3;
			str		=   "12"  +  3;
			str     =       "123";
			
			str		= "1" + 2 +  3;
			str     =    "12" +  3;
			str		= 		"123";
			
			System.out.println(value);
			System.out.println(str);
	}
}
