package ch02_1_variable;

//int var = 100;

public class VariableScopeExample {
	
	//int var = 100;
	
	public static void main(String[] args) {
		//int var = 100;
		//System.out.println(var);
		
		//show();
		
		int var1 = 1;
		if(1>0) {
			int var2 = 2;
			System.out.println(var2);
		}
		
//		for(;;) {
//			int var3 = 3;
//		}
		
		System.out.println(var1);
		System.out.println(var1);
	}
	
//	static int var = 100;
//	static void show(){
//		System.out.println(var);
//	}
}
