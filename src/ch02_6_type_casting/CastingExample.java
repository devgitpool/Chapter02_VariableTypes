package ch02_6_type_casting;

public class CastingExample {
	public static void main(String[] args) {
//		Ȯ�庯ȯ(Promotion) : int-->double �ս�X �ڵ�����ȯ
//		��Һ�ȯ(Demotion)	  : double-->int �ս�O ��������ȯ
		
//		���� ��� ���� Ÿ�� = (����Ÿ��)ū ��� ���� Ÿ�� 
//		(����Ÿ��)���� ��ȯ�Ͽ� ������ ������ �����Ѵ�.
		
//		ĳ���� ������ (�ڷ���) ��ȣ ���
		int intValue = 127;
		intValue = 1000000;
		byte byteValue = (byte)intValue; // ����(�����) Ÿ�� ��ȯ
		System.out.println(byteValue);	 // 64 ���
		
//		(char)<--int ��������ȯ ����: ���ڸ� ����ϱ� ����
		System.out.println(65);
		System.out.println((char)65);
		System.out.printf("Integer ���: %d\n", 65);
		System.out.printf("Char    ���: %c\n", 65);
		intValue = 66;
		char charValue = (char)byteValue;
		System.out.println(charValue); // 64'@'�� ���
		
//		byte,short,int,long<--(double, float)
//		�Ҽ��� ���� �κ��� ��������. ���� �κи� ����
		double doubleValue = 3.14;
		intValue = (int)doubleValue; // 3
		System.out.println(intValue);
		doubleValue = 3.74;
		System.out.println(doubleValue);
		intValue = (int)doubleValue;
		System.out.println(intValue);
		
//		�ǹ����� Ÿ�� ĳ������ ����ϴ� ���
//		- ���ڿ��� �ִ� ���ڸ� ����ϰ� ���� ��
//		- String str = (String)(3:����)
//		- �����(�ܺ�Ŭ����api/�������̽�)���� ������ �ڷ������� 
//		    ��ȯ�� �ʿ��� ��
		

	}
}
