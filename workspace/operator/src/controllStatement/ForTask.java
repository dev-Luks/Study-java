package controllStatement;

import java.util.Scanner;

public class ForTask {
   public static void main(String[] args) {
//      브론즈
//      1~100까지 출력	   
//      for (int i = 0; i < 100; i++) {
//         System.out.println(i + 1);
//      }
//      100~1까지 출력	   
//      for (int i = 0; i < 100; i++) {
//         System.out.println(100 - i);
//      }
//      1~100까지 중 짝수만 출력 (2의배수라고 생각)
//      for (int i = 0; i < 50; i++) {
//         System.out.println((i + 1) * 2);
//      }
	 
      
//      실버
//      1~10까지 합 출력    
//	   	int sum = 0;
//	   	for(int i=0; i <10; i++) {
////	   		sum = sum + i +1;
//	   		sum += i+1;
//	   	}
//	   	System.out.println(sum );
	   
	   
//      int total = 0; (합을 구할 때는 대입하기)
//      for (int i = 0; i < 10; i++) {
////         total = total + i + 1;
//	   total = 0+1
//	   total = (0+1) + 2
//         total += i + 1;
//      }
//      System.out.println(total);
      
//      1~n까지 합 출력
			
	   			
//      Scanner sc = new Scanner(System.in);
//      String message = "1~n까지 합\nn: ";
//      int end = 0, total = 0;
//      System.out.print(message);
//      end = sc.nextInt();
//      
//      for (int i = 0; i < end; i++) {
//         total += i + 1;
//      }
//      System.out.println(total);
      
//      골드
//      A~F까지 출력 (아스키코드 대문자 65 ,소문자 97)
  
//      for (int i = 0; i < 6; i++) {
//         System.out.println((char)(i + 65));
//      }
//      A~F까지 중 C제외하고 출력
//	   A~G까지 중 B,D제외하고 출력
	   for(int i = 0; i<7; i++) {
		  if(i==(char)(i+66)){continue;}
		  if(i==(char)(i+68)) {continue;}
		  System.out.println((char)(i+65));
			  
		   
		   
	   }
	  	   
//      for (int i = 0; i < 5; i++) {
//         System.out.println((char)(i > 1 ? i + 66 : i + 65));
//      }
      
//      다이아 (%는 나머지 /는 목) (나머지를 사용하기)
//      0 1 2 3 0 1 2 3 0 1 2 3 출력

//      for (int i = 0; i < 12; i++) {
//         System.out.print(i % 4 + " ");
//      }
      
//      aBcDeFgH...Z 출력
  
      for (int i = 0; i < 26; i++) {
         System.out.print((char)(i % 2 == 0 ? i + 97 : i + 65));
      }
   }
}

