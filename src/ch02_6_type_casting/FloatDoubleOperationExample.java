package ch02_6_type_casting;

public class FloatDoubleOperationExample {
	public static void main(String[] args) {
//        피연산자	   연산자	        피연산자
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
		
//		소수점을 버리고 연산 할 경우라면...		    3
		int result2;
		result2 = iv + (int)dv;
		System.out.println(result2);
		
//		실수 리터럴 연산
		float result3;
//		result3 = 1.5  +  2.3;  // double + double
//		result3 = 1.5  +  2.3f;
		result3 = 1.5f +  2.3f; // 명시적으로 컴파일러에게 float임을 알려줌
		
		System.out.println(result3);
			
//		[실무에서 주의해야 할 나누기 연산]
		
		int x 		=  1;
		int y 		=  2;
		double d 	= .0;
		
//		(double)       (int) 연산   (int) : 연산 결과(int) 
		   d      =      x    /    y;   
//		                              0.5 -> 0 ----------------> 0.0
//										소수점(X)  자동형변환									                               
		System.out.println(d); // ??
		
//		(double)  =    (int)  /  (double) : 연산 결과(int)		
//                  > double변환				> 연산결과(double)
		
		   d	  =  (double)x / y;
		   
		System.out.println(d);   
		
	}
}
