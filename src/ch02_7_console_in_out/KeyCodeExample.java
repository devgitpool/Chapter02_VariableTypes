package ch02_7_console_in_out;

import java.io.IOException;

public class KeyCodeExample {
	public static void main(String[] args) throws IOException {
//					[키보드로부터 입력된 내용을 변수에 저장하기]
//		System.in(InputStream).read()로 읽은 키코드를 변수에 저장
		
		int keyCode;
		
// 		"ABC", 'a' 입력		
//		'Enter'키가 입력될 때 까지 대기...
//		'Enter'키 입력되면 입력된 키코드 읽기...  
		keyCode = System.in.read();
		System.out.printf("KeyCode : %d\n", keyCode);
		
		keyCode = System.in.read();
		System.out.printf("KeyCode : %d\n", keyCode);
		
		keyCode = System.in.read();
		System.out.printf("KeyCode : %d\n", keyCode);
		
	}
}
