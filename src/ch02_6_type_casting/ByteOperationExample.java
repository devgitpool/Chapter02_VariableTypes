package ch02_6_type_casting;

public class ByteOperationExample {
	public static void main(String[] args) {
//		���� ���꿡���� �ڵ� Ÿ�� ��ȯ
// 		����Ÿ�Ժ����� ��� ����Ŀ��� �ǿ����ڷ� ���Ǹ� 
//		int���� ���� Ÿ���� ������ int Ÿ������ promotion�Ǿ� ���� ����
		
//							�ǿ�����			    ������	              �ǿ�����
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
		System.out.println(result); // -81�� ��µ�
		//2.
		int result2 = x + y;
		System.out.println(result2);
	}
}
