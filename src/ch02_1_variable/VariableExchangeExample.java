package ch02_1_variable;

public class VariableExchangeExample {
	public static void main(String[] args) {
		
		int x = 3; // x��
		int y = 5; // y��
							//x:3, y:5
		System.out.println("x:" + x + ", y:" + y);
		
		//temporary�Ͻ�����,�ӽ���
		int temp = x; // ����
		
		x = y;
		
		y = temp;
		
		System.out.println("x:" + x + ", y:" + y);
	}
}
