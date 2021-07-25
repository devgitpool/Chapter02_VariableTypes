package ch02_7_console_in_out;

//import java.util.Scanner;

public class SystemInOut {
	public static void main(String[] args) {
		
//		    [KeyCodeExample.java]

		
//		try {			
////			System.out.println(System.in.read());
////			System.out.println(System.in.read());
////			System.out.println(System.in.read());
//			
//			System.out.printf("keyCode: %d\n", System.in.read());
//			System.out.printf("keyCode: %d\n", System.in.read());
//			System.out.printf("keyCode: %d\n", System.in.read());
//			
//		} catch (java.io.IOException e) {
//			e.toString();
//		}

		
//		[ContinueKeyCodeReadExample.java]
		
		
//		while(true) {
//			try {
//				System.out.printf("keyCode: %d\n", System.in.read());
//				
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
		

//		[QStopExample.java]
		
//		boolean working = true;
//		int keyCode;
//		
//		while (working) {
//			try {
//				
//				keyCode = System.in.read();
//				System.out.printf("keyCode: %d\n", keyCode);
//				
//				if(keyCode == 'q' || keyCode == 'Q') {
//					working = false;
//				}
//				
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//		
//		
//		System.out.println("프로그램을 정상적으로 종료합니다.");
//		
		
//		[ScannerExample.java] : 
		
		// java.lang 패키지 아니므로 import
//		java.util.Scanner scan = new java.util.Scanner(System.in);
//		String str = "";
//		while(true) {
//			System.out.printf("입력된 문자열: \"%s\"\n", str = scan.nextLine());
//			if(str.equalsIgnoreCase("q")) {
//				break;
//			}
//		}
//		scan.close();
//		System.out.println("프로그램 종료");
	}
}
