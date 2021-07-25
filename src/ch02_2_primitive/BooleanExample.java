package ch02_2_primitive;

public class BooleanExample {
	public static void main(String[] args) {
//		논리 리터럴 : 1byte   참과 거짓(true/false)을 사용
		boolean onOff = false;
		boolean state = true;
//		status	: 결과로서의 상태를 의미한다.
//		state	: 현재의 상태를 의미한다.
//		즉 상태가 완료 것은 status, 상태가 계속 바뀌는 것은 state를 사용한다.
		System.out.println(state);
		
//		boolean IS_PLAYING = false;
		
//		두 가지 상태값에 따라 조건문과 제어문의 실행 흐름을 변경하는 데 사용
		if (!onOff) {
			System.out.println("켜시오");
		}
		else {
			System.out.println("끄시오");
		}
	}
}
