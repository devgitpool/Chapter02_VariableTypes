package ch02_2_primitive;

public class LongExample {
	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20L;
		long var3;
		//기본적으로 컴파일러는 정수 리터럴을 int 타입으로 간주!
		//long 타입임을 컴파일러에게 알려주어야 한다
		//   var3 = 1000000000_0;
			 var3 = 1000000000_0L;
		
		System.out.println(var1);	 
		System.out.println(var2);	 
		System.out.println(var3);	 
	}
}
