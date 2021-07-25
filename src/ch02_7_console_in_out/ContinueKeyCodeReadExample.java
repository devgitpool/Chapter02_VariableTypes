package ch02_7_console_in_out;

import java.io.IOException;

public class ContinueKeyCodeReadExample {
	public static void main(String[] args) throws IOException {
		int keyCode;
		
		while(true) {
			keyCode = System.in.read();
			
//			if((char)keyCode == 'q')
//				break;
			
			System.out.println("KeyCode: " +  keyCode);
			
			if((char)keyCode == 'q')
				break;
		}
		
		System.out.println("프로그램 종료");
	}
}
