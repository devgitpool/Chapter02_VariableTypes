package ch02_6_type_casting;

public class FloatDoubleOperationExample {
	public static void main(String[] args) {
//        �ǿ�����	   ������	        �ǿ�����
//[double] result = [double]num1 (+-/*%) [float]num2 
//					                     -> (double)
		
		float  fv = 1.2f;
		double dv = 3.4;
		
//		                double : 1.2d
		double result =       fv      +     dv;
		System.out.println(result);
		
		
		int iv = 10;
		result = 	           iv 		+ 		 dv;
//                       double : 10.0
		System.out.println(result);
		
//		�Ҽ����� ������ ���� �� �����...		    3
		int result2;
		result2 = iv + (int)dv;
		System.out.println(result2);
		
//		�Ǽ� ���ͷ� ����
		float result3;
//		result3 = 1.5  +  2.3;  // double + double
//		result3 = 1.5  +  2.3f;
		result3 = 1.5f +  2.3f; // ��������� �����Ϸ����� float���� �˷���
		
		System.out.println(result3);
			
//		[�ǹ����� �����ؾ� �� ������ ����]
		
		int x 		=  1;
		int y 		=  2;
		double d 	= .0;
		
//		(double)       (int) ����   (int) : ���� ���(int) 
		   d      =      x    /    y;   
//		                              0.5 -> 0 ----------------> 0.0
//										�Ҽ���(X)  �ڵ�����ȯ									                               
		System.out.println(d); // ??
		
//		(double)  =    (int)  /  (double) : ���� ���(int)		
//                  > double��ȯ				> ������(double)
		
		   d	  =  (double)x / y;
		   
		System.out.println(d);   
		
	}
}
