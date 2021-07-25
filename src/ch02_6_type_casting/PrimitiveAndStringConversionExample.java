package ch02_6_type_casting;

public class PrimitiveAndStringConversionExample {
	public static void main(String[] args) {
		
//		[실무에서 가장 많이 쓰이는 강제 타입 변환]
//		문자열 ---> 숫자
//		     <---
		String  str = "100";
		int 	var =  100;
		
//		str = str + 1; // "1001"   
//		var = var + 1; //  101
		
//		파싱하여 처리(wrapper Class의 메서드 사용)
//		parse : (문장을 문법적으로) 분석하다 
//		        <낱말의> 품사·문법적 관계를 설명하다		
		
	    var = Integer.parseInt(str); // 문자열을 숫자로...
		System.out.println(var + 1); // 101
		
		str = Integer.toString(var); // 숫자를 문자열로...
		str = String.valueOf(var);
		System.out.println(str + 1); // 1001
		
//		wrapper클래스 사용 예시
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.toBinaryString(-9999999));
		
//		숫자형식예외(NumberFormatException)가 발생하는 경우
		System.out.println(Integer.parseInt("100000000000"));
		System.out.println(Integer.parseInt("3M"));

	}
}
