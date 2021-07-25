package ch02_6_type_casting;

public class ByteOperationExample {
	public static void main(String[] args) {
//		정수 연산에서의 자동 타입 변환
// 		정수타입변수가 산술 연산식에서 피연산자로 사용되면 
//		int보다 작은 타입의 변수는 int 타입으로 promotion되어 연산 수행
		
//							피연산자			    연산자	              피연산자
//		[int] result = [byte,char,short]num1 (+-/*%) [byte,char,short]num2 
//							-> (int)                       -> (int)

		byte x = 10; byte y = 20;
//		byte x = 100; byte y = 75;
//		byte result = x + y;
//		     result = 30;
		     
//	    int intValue = 30;
//	    	result = intValue;
		//1.
		byte result = (byte)(x + y);
		System.out.println(result); // -81이 출력됨
		//2.
		int result2 = x + y;
		System.out.println(result2);
	}
}
