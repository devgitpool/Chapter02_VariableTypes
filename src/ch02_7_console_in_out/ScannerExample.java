package ch02_7_console_in_out;

// Scanner�� java.util��Ű���� �ִٴ� ���� �˷��ش�.
import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
//					[Scanner]
//		System.in.read()�� ����: �����͸� �ϳ��� �о�� 2�� �̻��� Ű�� ���յ� �ѱ��� ���� �� ����. 
//							     �Էµ� ������ �� ���ڿ��� ���� ���Ѵ�.
		Scanner scanner = new Scanner(System.in); // InputStream ������ �����ε�
		String inputData = scanner.nextLine(); // 'Enter'Ű �������� �Էµ� ���ڿ��� �о�´�.
//		while(���ǽ�:boolean)
		while(true) {
			inputData = scanner.nextLine();
			System.out.println("�Էµ� ���ڿ�: \"" + inputData + "\"");
			
//			�⺻Ÿ���� ���� ��������(var1 == var2)
//			���ڿ�(String)�� ������ �� (str.equals())
			if(inputData.equals("q")) {
				break;
			}
		}
		
		scanner.close();
		System.out.println("���α׷� ����");
	}
}
