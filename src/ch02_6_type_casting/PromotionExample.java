package ch02_6_type_casting;

public class PromotionExample {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
//		�ڵ�Ÿ�Ժ�ȯ : ���� ��� ������ ū Ÿ�� = ���� Ÿ�� 
//			byte(1)<short(2)<int(4)<long(8)<float(4)<double(8)
//		                  (long < float) == true ?
		int   iv = 999999999;
		long  lv = 999999999999999999L;
		float fv = 99999999999999999999999999999999999999.0f;
		
//		����(int = byte) �ڵ� Ÿ�� ��ȯ
		byte byteValue = 10;
		int  intValue  = byteValue;
		
//		����(int = char) �ڵ�Ÿ�� ��ȯ
		char charValue = 'A';
		intValue = charValue;
		System.out.println(intValue);
		
//		����(char = byte) �ڵ�Ÿ�� ��ȯ(X)
//		charValue = byteValue; "char"�� ������ �������� �ʴ´�.
		
//		�Ǽ�Ÿ��<-����Ÿ�� �ڵ� Ÿ�� ��ȯ
		long longValue 	 = 1000000000L;		                   
		float floatValue = longValue; // 1.0e9f
		System.out.println(floatValue);
		
//		System.out.printf("e-value : %e\n", floatValue);
//		System.out.printf("f-value : %f\n", floatValue);
		
		
//		����(�����)Ÿ�Ժ�ȯ
	}
}
