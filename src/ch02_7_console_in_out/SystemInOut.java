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
//		System.out.println("���α׷��� ���������� �����մϴ�.");
//		
		
//		[ScannerExample.java] : 
		
		// java.lang ��Ű�� �ƴϹǷ� import
//		java.util.Scanner scan = new java.util.Scanner(System.in);
//		String str = "";
//		while(true) {
//			System.out.printf("�Էµ� ���ڿ�: \"%s\"\n", str = scan.nextLine());
//			if(str.equalsIgnoreCase("q")) {
//				break;
//			}
//		}
//		scan.close();
//		System.out.println("���α׷� ����");
	}
}
