package ch02_2_primitive;

public class StringExample {
	public static void main(String[] args) {
		/**
		 * String�� �⺻Ÿ���� �ƴϴ�. Ŭ���� Ÿ���̴�.
		 * �⺻Ÿ��:boolean,byte,char,short,int,float,double
		 */
//		'': �����Ϸ��� ���� ���ͷ��� �ν�    'c'
//		"": �����Ϸ��� ���ڿ� ���ͷ��� �ν� "circle"
		char[] ch = new char[]{'a','b','c'};
//		System.out.println(ch[0]);
		for(int i=0; i<ch.length; i++)
			System.out.print(ch[i]);
		System.out.println();
		
		System.out.printf("char[] : %s\n", String.valueOf(ch));
		
		String str = "abc";
		System.out.printf("String : %s\n", str);
		
		String name = "ȫ�浿";
		String job = "���α׷���";
		System.out.println(name);
		System.out.println(job);
		
	}
}
