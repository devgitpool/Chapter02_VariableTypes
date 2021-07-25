package ch02_2_primitive;

public class CharExample {
	public static void main(String[] args) {
//		'����' : ���� ���ͷ�
//		  ���� ���ͷ��� �����ڵ�(2byte)�� ��ȯ�Ǿ� ����
//		 �����ڵ�: ���谢���� ���ڸ� ���ڷ� ������ ���� ǥ�� �Ծ�
		System.out.println(65);
		System.out.println((char)65); // �ڵ尪(65) : A
		System.out.println((int)'B');
		System.out.println((int)'��');
		System.out.println((char)44033);
		System.out.println((char)44034);
		System.out.println((char)44035);
		System.out.println((char)44036);
		System.out.println((int)'��');
		System.out.println((char)48578);
		
		char c1 = 'A';		//���ڸ� ���� ����
		char c2 = 65;		//10������ ����
		char c3 = '\u0041';	//16������ ����

		System.out.println(c1); //A
		System.out.println(c2); //65? A?
		System.out.println(c3); //A
		
		char c4 = '��';
		char c5 = 44032;
		char c6 = '\uac00';
		
		System.out.println(c4); //��
		System.out.println(c5);	//��
		System.out.println(c6); //��
		
		System.out.println((char)0xAC00);
		
	}
}
