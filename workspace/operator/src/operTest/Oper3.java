package operTest;

import java.util.Scanner;

public class Oper3 {

	public static void main(String[] args) {
//		사용자에게 키를 입력받고
//		정수라면 정수로 출력
//		실수라면 실수로 출력
//		예) 183 -> 183 출력
//		   183.5 -> 183.5 출력
//		삼항 연산자를 사용!

        
		//		일단 키를 입력받아야함
		
		
//		String key = "0";
//		int i = Integer.parseInt(key);
//		double d = Double.parseDouble(key);
//		double result = 0;
//		String message = "숫자키를 입력하세요" ;
////		Scanner
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println(message);
//		key = sc.next();
//		
//				
////		삼항연산자 사용해보기
////		정수가 맞아? 맞아(정수출력) : 아니야(실수출력)
////		나머지가 0이나 1로 떨어지면 정수, 소수점으로 떨어지면 실수 (쓰지말라함)
////		  실수값-정수값 > 0.0 ? 정수값 : 실수값 
//		
//		result = (d - i) > 0.0 ?  Integer.parseInt(key) : Double.parseDouble(key) ; 
//		
//		System.out.println(result); 
		
		  double height = 0.0;
	      String message = "키: ";
	      Scanner sc = new Scanner(System.in);
	      boolean check = false;
	      String format = null;
	      String forLength = "";
	      int length = 0;
	      
	      System.out.print(message);
	      height = sc.nextDouble();
	      check = height - (int)height == 0;
	      forLength = height - (int)height + "";
	      
	      length = forLength.length() > 8 ? 8 : forLength.length();
	      
	      format = check ? "%.0fcm" : "%." + (length - 2) + "fcm";
	      System.out.printf(format, height); 

		
		
		
		
				
	}

}
