package ch02_1_variable;

public class VariableExchangeExample {
	public static void main(String[] args) {
		
		int x = 3; // xÄÅ
		int y = 5; // yÄÅ
							//x:3, y:5
		System.out.println("x:" + x + ", y:" + y);
		
		//temporaryÀÏ½ÃÀûÀÎ,ÀÓ½ÃÀÇ
		int temp = x; // ºóÄÅ
		
		x = y;
		
		y = temp;
		
		System.out.println("x:" + x + ", y:" + y);
	}
}
