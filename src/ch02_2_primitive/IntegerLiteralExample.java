package ch02_2_primitive;

public class IntegerLiteralExample {
	public static void main(String[] args) {
		//static:��(�)��- �����, �������� �ʴ�...
		
		// ������ literal Ÿ��
		//(�ڷ���) (����) (���Կ�����)  (literal)
		    int   var 	    =         10;
		//        Lvalue    =    Rvalue           
		//        ����                      ����,���
		
		    System.out.println(var);
		    System.out.println(206);
		    System.out.println(0206);
		    
		int var1 = 0b1011;
		byte b1  = (byte) 0b11111011;
		System.out.println(b1);
		int var2 = 0206;
		int var3 = 365;
		int var4 = 0xB3;
		
		System.out.println(0b1011);
		System.out.println(365);
		System.out.println(0xB3);
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
	}
}
