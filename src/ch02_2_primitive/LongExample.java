package ch02_2_primitive;

public class LongExample {
	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20L;
		long var3;
		//�⺻������ �����Ϸ��� ���� ���ͷ��� int Ÿ������ ����!
		//long Ÿ������ �����Ϸ����� �˷��־�� �Ѵ�
		//   var3 = 1000000000_0;
			 var3 = 1000000000_0L;
		
		System.out.println(var1);	 
		System.out.println(var2);	 
		System.out.println(var3);	 
	}
}
