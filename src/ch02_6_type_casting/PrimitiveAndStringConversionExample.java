package ch02_6_type_casting;

public class PrimitiveAndStringConversionExample {
	public static void main(String[] args) {
		
//		[�ǹ����� ���� ���� ���̴� ���� Ÿ�� ��ȯ]
//		���ڿ� ---> ����
//		     <---
		String  str = "100";
		int 	var =  100;
		
//		str = str + 1; // "1001"   
//		var = var + 1; //  101
		
//		�Ľ��Ͽ� ó��(wrapper Class�� �޼��� ���)
//		parse : (������ ����������) �м��ϴ� 
//		        <������> ǰ�硤������ ���踦 �����ϴ�		
		
	    var = Integer.parseInt(str); // ���ڿ��� ���ڷ�...
		System.out.println(var + 1); // 101
		
		str = Integer.toString(var); // ���ڸ� ���ڿ���...
		str = String.valueOf(var);
		System.out.println(str + 1); // 1001
		
//		wrapperŬ���� ��� ����
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.toBinaryString(-9999999));
		
//		�������Ŀ���(NumberFormatException)�� �߻��ϴ� ���
		System.out.println(Integer.parseInt("100000000000"));
		System.out.println(Integer.parseInt("3M"));

	}
}
