package exceptionTest;

public class ExceptionTest {
	public static void main(String[] args) {
		try {
		System.out.println(10/0);
		System.out.println("���� ����!");
		} catch(ArithmeticException e) {
//			e.printStackTrace(); //����: ��� �����ΰ� Ȯ���� �� ���� ��.
//			System.out.println(e.getMessage());
//			System.out.println(e);
//			System.out.println("0���� ���� �� �����ϴ�.");
		} catch(Exception e) {      //��� ������ �θ� Exception
			e.printStackTrace();
		}
	}

}
