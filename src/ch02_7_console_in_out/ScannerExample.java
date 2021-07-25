package ch02_7_console_in_out;

// Scanner가 java.util패키지에 있다는 것을 알려준다.
import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
//					[Scanner]
//		System.in.read()의 단점: 데이터를 하나씩 읽어와 2개 이상의 키가 조합된 한글을 읽을 수 없다. 
//							     입력된 내용을 통 문자열로 읽지 못한다.
		Scanner scanner = new Scanner(System.in); // InputStream 생성자 오버로딩
		String inputData = scanner.nextLine(); // 'Enter'키 이전까지 입력된 문자열을 읽어온다.
//		while(조건식:boolean)
		while(true) {
			inputData = scanner.nextLine();
			System.out.println("입력된 문자열: \"" + inputData + "\"");
			
//			기본타입의 값이 동일한지(var1 == var2)
//			문자열(String)이 동일한 지 (str.equals())
			if(inputData.equals("q")) {
				break;
			}
		}
		
		scanner.close();
		System.out.println("프로그램 종료");
	}
}
