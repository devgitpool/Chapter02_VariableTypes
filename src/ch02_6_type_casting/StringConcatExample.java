package ch02_6_type_casting;

public class StringConcatExample {
	public static void main(String[] args) {
//		[ + ���� ]
//		- ���� ���� 		: ���� + ����
//		- ���ڿ� ���� ����	: ���� + ���ڿ� , ���ڿ� + ����
//		                  -> ���ڿ��� �ڵ� ��ȯ
		String str = "";	
		
		int value 	= 1 + 2 +  3;
			value 	=   3   +  3;
			value 	=       6;
//					   ��	   ��  				
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
