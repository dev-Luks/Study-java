package operTest;

import java.util.Scanner;

import jdk.internal.misc.FileSystemOption;

public class Oper4 {
   public static void main(String[] args) {
//      심리 테스트
      /*
       * Q. 당신이 좋아하는 색을 선택하세요.
       * 1. 빨간색
       * 2. 노란색
       * 3. 검은색
       * 4. 흰색
       * 
       * 빨간색 : 불같고 열정적이고 적극적이다.
       * 노란색 : 발랄하고 밝고 귀엽고 개성있고 착하다.
       * 검은색 : 묵묵하고 든든하고 냉철하고 멋지다.
       * 흰색 : 천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.
       * 
       */

//	   까먹지말고 초기화!
//	   int num = 0;  
////	   String 으로 메시지 작성! result 까먹지 말기~
//	   String title = "Q. 당신이 좋아하는 색은 몇번인가요?" ,result = null ;
//	   String menu = "1. 빨간색 \n" + "2. 노란색 \n" + "3. 검은색 \n" + "4. 흰색 \n"  ;
////	   결과값 받아줄
//	   String redMsg = ". 빨간색 : 불같고 열정적이고 적극적이다." , yelMsg = ". 노란색 : 발랄하고 밝고 귀엽고 개성있고 착하다." ,
//			  blaMsg = ". 검은색 : 묵묵하고 든든하고 냉철하고 멋지다.", whiMsg = ". 흰색 : 천사같고 깔끔하고 정리를 좋아하고 배려심이 많다." ;		   
//	   Scanner sc = new Scanner(System.in);
//	   
//	   System.out.println(title);
//	   System.out.println(menu);
//	   num = sc.nextInt();
//	    
////	   1이면 1번 문장 1이 아니면 다음번호로! ( 5번부터는 잘못입력하셨습니다로 입력!)
//	   result = num == 1 ? num + redMsg : num == 2 ?  num + yelMsg 
//			  : num == 3 ?  num +blaMsg : num == 4 ? num + whiMsg 
//					   : num + ". 잘못 입력하셨습니다." ; 
//	   
//	   System.out.println(result);
	   
	   String message = "Q. 당신이 좋아하는 색을 선택하세요.";
	      String choiceMessage = "1.빨간색\n2.노란색\n3.검은색\n4.흰색";
	      String redMessage = "불같고 열정적이고 적극적이다."; 
	      String yellowMessage = "발랄하고 밝고 귀엽고 개성있고 착하다."; 
	      String blackMessage = "묵묵하고 든든하고 냉철하고 멋지다."; 
	      String whiteMessage = "천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.";
	      String errorMessage = "다시 입력해주세요.";
	      String result = null;
	      Scanner sc = new Scanner(System.in);
	      int choice = 0;
	      
	      System.out.println(message + "\n" + choiceMessage);
	      choice = sc.nextInt();
	      
//	      result = choice == 1 ? redMessage :
//	         choice == 2 ? yellowMessage :
//	            choice == 3 ? blackMessage :
//	               choice == 4 ? whiteMessage :
//	                  errorMessage;
	    
	   
	      
	      
//	      if(choice == 1) {
//	         result = redMessage;
//	         
//	      }else if(choice == 2) {
//	         result = yellowMessage;
//	         
//	      }else if(choice == 3) {
//	         result = blackMessage;
//	         
//	      }else if(choice == 4) {
//	         result = whiteMessage;
//	         
//	      }else {
//	         result = errorMessage;
//	         
//	      }

     
	      
	      switch(choice) {
	      case 1:
	         result = redMessage;
	         break;
	      case 2:
	         result = yellowMessage;
	         break;
	      case 3:
	         result = blackMessage;
	         break;
	      case 4:
	         result = whiteMessage;
	         break;
	      default:
	         result = errorMessage;
	         break;
	      }
	      
	      System.out.println(result);

	   
	   
	   
   }
}