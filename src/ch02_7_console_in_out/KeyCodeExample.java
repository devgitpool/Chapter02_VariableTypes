package ch02_7_console_in_out;

import java.io.IOException;

public class KeyCodeExample {
	public static void main(String[] args) throws IOException {
//					[Ű����κ��� �Էµ� ������ ������ �����ϱ�]
//		System.in(InputStream).read()�� ���� Ű�ڵ带 ������ ����
		
		int keyCode;
		
// 		"ABC", 'a' �Է�		
//		'Enter'Ű�� �Էµ� �� ���� ���...
//		'Enter'Ű �ԷµǸ� �Էµ� Ű�ڵ� �б�...  
		keyCode = System.in.read();
		System.out.printf("KeyCode : %d\n", keyCode);
		
		keyCode = System.in.read();
		System.out.printf("KeyCode : %d\n", keyCode);
		
		keyCode = System.in.read();
		System.out.printf("KeyCode : %d\n", keyCode);
		
	}
}
