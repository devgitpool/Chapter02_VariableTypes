package ch02_2_primitive;

public class FloatDoubleExample {
	public static void main(String[] args) {
//      �Ǽ� ���ͷ�: -1.78945621, 0.25, 3.14, .......
//		�ڹٴ� �Ǽ� ���ͷ��� �⺻������ double Ÿ������ �ؼ��Ѵ�.
		//float var = 3.14;
		  float var = 3.14f;
		  System.out.println(var);
//		�Ǽ��� ���� ǥ��� : 
//		5E2     -> 5*10������ 		 -> 5*100 		= 500.0
//		0.12e-2 -> 0.12*1/10������ -> 0.12*1/100 	= 0.0012 	
//		? = 3.14 : 314e-2;
		  
//		float : 4byte ���е�(7  �ڸ�)
//		double: 8byte ���е�(15�ڸ�)
		  
		  System.out.println(1/3);
		  System.out.println(1/3.0f);
		  System.out.println(1/3.0);
		  
		  System.out.println(0.1234567890123456789f);
		  System.out.println(0.1234567890123456789d);
		  
//		  float var1 = 3.14;
		  float var2 = 3.14f;
		  double var3 = 3.14;
		  
		  System.out.println(var2);
		  System.out.println(var3);
		  
		  double var6 = 3e6;
		  float var7 = 3e6F;
		  double var8 = 2e-3;
		  
		  System.out.println(var6);
		  System.out.println(var7);
		  System.out.println(var8);		  	  
	}
}
