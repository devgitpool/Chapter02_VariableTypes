package ch02_2_primitive;

public class EscapeExample {
	public static void main(String[] args) {
//		이스케이프 문자(escape sequence) : 
		System.out.println("\"자바\" 프로그래밍 언어");
		System.out.println("C\t 프로그래밍 언어");
		System.out.print("프로그래밍 \n언어\n");
		System.out.println("유니코드 : \u0041");
		
		System.out.println("번호\t이름\t직업");
		System.out.print("행 단위 출력\n");
		System.out.print("행 단위 출력\n");
		System.out.println("우리는 \"개발자\" 입니다.");
		System.out.println("봄\\여름\\가을\\겨울");
		
		String path 
		= "E:\\Dev20210719\\StudyJava\\Chapter02_VariableTypes";
		System.out.println(path);
	}
}
