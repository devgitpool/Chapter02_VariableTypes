package ch02_6_type_casting;

public class LongOperationExample {
	public static void main(String[] args) {
		
//		                      �ǿ�����	   ������	        �ǿ�����
//[long] result = [long]num1 (+-/*%) [byte,char,short,int]num2 
//		            -> (int) : X             -> (long)

		byte 	value1 	= 10;
		int  	value2	= 100;
		long	value3	= 1000L;
		
//		?    result = value1 + value2 + value3;
		long result = value1 + value2 + value3;
		
		System.out.println(result);
	}
}
