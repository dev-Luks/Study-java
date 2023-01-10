package exceptionTest;

public class ExceptionTest {
	public static void main(String[] args) {
		try {
		System.out.println(10/0);
		System.out.println("연산 성공!");
		} catch(ArithmeticException e) {
//			e.printStackTrace(); //검증: 어디서 문제인가 확인할 때 쓰는 거.
//			System.out.println(e.getMessage());
//			System.out.println(e);
//			System.out.println("0으로 나눌 수 없습니다.");
		} catch(Exception e) {      //모든 예외의 부모가 Exception
			e.printStackTrace();
		}
	}

}
