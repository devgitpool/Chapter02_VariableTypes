package ch02_2_primitive;

public class EscapeExample {
	public static void main(String[] args) {
//		�̽������� ����(escape sequence) : 
		System.out.println("\"�ڹ�\" ���α׷��� ���");
		System.out.println("C\t ���α׷��� ���");
		System.out.print("���α׷��� \n���\n");
		System.out.println("�����ڵ� : \u0041");
		
		System.out.println("��ȣ\t�̸�\t����");
		System.out.print("�� ���� ���\n");
		System.out.print("�� ���� ���\n");
		System.out.println("�츮�� \"������\" �Դϴ�.");
		System.out.println("��\\����\\����\\�ܿ�");
		
		String path 
		= "E:\\Dev20210719\\StudyJava\\Chapter02_VariableTypes";
		System.out.println(path);
	}
}
