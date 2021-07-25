package ch02_2_primitive;

public class IntegerLiteralExample {
	public static void main(String[] args) {
		//static:정(靜)적- 고요한, 움직이지 않는...
		
		// 정수의 literal 타입
		//(자료형) (변수) (대입연산자)  (literal)
		    int   var 	    =         10;
		//        Lvalue    =    Rvalue           
		//        변수                      변수,상수
		
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
