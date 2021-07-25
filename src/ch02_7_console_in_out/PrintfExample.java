package ch02_7_console_in_out;

public class PrintfExample {
	public static void main(String[] args) {
//									[표준 입출력]
//		키보드(입력) -------------------> 컴퓨터 -------------------> 모니터(출력)
//						System.in				System.out
//		                InputStream				OutputStream
//						read()					write()
		
//		클래스명. PrintStream참조변수. 메서드
		System.             out.  println("Console print.....");
//		println();
//		print();
//		printf(String format, Object ... args)
//		printf("형식화된 문자열", 값1, 값2.........)
//		printf("문자열%", 값) %:형식 문자열의 시작 + conversion: d(정수), f(실수), s(문자열)     
		
		System.out.printf("이름: %s", "김자바\n");
		System.out.printf("나이: %d\n",  25);
		System.out.printf("주소: %s\n", "서울");
		System.out.printf("신장: %f\n", 175.6);
		System.out.printf("십육진수 15= %x\n", 15);
		
//		이클립스 단축키 설정
//		[Window]-[Preferences]를 클릭하고 
//		[Java]-[Editor]-[Templates]
//		(${word_selection}${});${cursor} 복사
//		sysf 등록
		
		int value = 123;
		
		System.out.printf("상품의 가격: %d원\n", value);
		System.out.printf("상품의 가격: %6d원\n", value);
		System.out.printf("상품의 각격: %-6d원\n", value);
		System.out.printf("상품의 각격: %06d원\n", value);
		
		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이: %10.2f\n", 10, area);
		
		String name = "홍길동";
		String job 	= "도적";
		
//		값의 순서와 개수가 일치해야 한다
		System.out.printf("%6d | %-10s | %10s\n", 1, name, job);
	}
}
