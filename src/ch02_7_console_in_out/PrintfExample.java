package ch02_7_console_in_out;

public class PrintfExample {
	public static void main(String[] args) {
//									[ǥ�� �����]
//		Ű����(�Է�) -------------------> ��ǻ�� -------------------> �����(���)
//						System.in				System.out
//		                InputStream				OutputStream
//						read()					write()
		
//		Ŭ������. PrintStream��������. �޼���
		System.             out.  println("Console print.....");
//		println();
//		print();
//		printf(String format, Object ... args)
//		printf("����ȭ�� ���ڿ�", ��1, ��2.........)
//		printf("���ڿ�%", ��) %:���� ���ڿ��� ���� + conversion: d(����), f(�Ǽ�), s(���ڿ�)     
		
		System.out.printf("�̸�: %s", "���ڹ�\n");
		System.out.printf("����: %d\n",  25);
		System.out.printf("�ּ�: %s\n", "����");
		System.out.printf("����: %f\n", 175.6);
		System.out.printf("�������� 15= %x\n", 15);
		
//		��Ŭ���� ����Ű ����
//		[Window]-[Preferences]�� Ŭ���ϰ� 
//		[Java]-[Editor]-[Templates]
//		(${word_selection}${});${cursor} ����
//		sysf ���
		
		int value = 123;
		
		System.out.printf("��ǰ�� ����: %d��\n", value);
		System.out.printf("��ǰ�� ����: %6d��\n", value);
		System.out.printf("��ǰ�� ����: %-6d��\n", value);
		System.out.printf("��ǰ�� ����: %06d��\n", value);
		
		double area = 3.14159 * 10 * 10;
		System.out.printf("�������� %d�� ���� ����: %10.2f\n", 10, area);
		
		String name = "ȫ�浿";
		String job 	= "����";
		
//		���� ������ ������ ��ġ�ؾ� �Ѵ�
		System.out.printf("%6d | %-10s | %10s\n", 1, name, job);
	}
}
