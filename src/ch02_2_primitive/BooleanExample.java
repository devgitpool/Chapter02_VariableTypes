package ch02_2_primitive;

public class BooleanExample {
	public static void main(String[] args) {
//		�� ���ͷ� : 1byte   ���� ����(true/false)�� ���
		boolean onOff = false;
		boolean state = true;
//		status	: ����μ��� ���¸� �ǹ��Ѵ�.
//		state	: ������ ���¸� �ǹ��Ѵ�.
//		�� ���°� �Ϸ� ���� status, ���°� ��� �ٲ�� ���� state�� ����Ѵ�.
		System.out.println(state);
		
//		boolean IS_PLAYING = false;
		
//		�� ���� ���°��� ���� ���ǹ��� ����� ���� �帧�� �����ϴ� �� ���
		if (!onOff) {
			System.out.println("�ѽÿ�");
		}
		else {
			System.out.println("���ÿ�");
		}
	}
}
