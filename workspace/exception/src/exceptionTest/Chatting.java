package exceptionTest;

import java.util.Scanner;

public class Chatting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message = null;
		
		System.out.println("메세지: ");
		message = sc.nextLine();
	
		if(message.contains("바보")) {   //contains 문자열에 포함되어있을때
			try {
				throw new BadWordException("욕설은 안돼요!");
			} catch (BadWordException e) {
				System.out.println(e.getMessage());
			} //필드에 올리기 위해 예외던지기 art shift z
		}
		
	}
}
