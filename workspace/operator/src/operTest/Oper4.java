package operTest;

import java.util.Scanner;

import jdk.internal.misc.FileSystemOption;

public class Oper4 {
   public static void main(String[] args) {
//      �ɸ� �׽�Ʈ
      /*
       * Q. ����� �����ϴ� ���� �����ϼ���.
       * 1. ������
       * 2. �����
       * 3. ������
       * 4. ���
       * 
       * ������ : �Ұ��� �������̰� �������̴�.
       * ����� : �߶��ϰ� ��� �Ϳ��� �����ְ� ���ϴ�.
       * ������ : �����ϰ� ����ϰ� ��ö�ϰ� ������.
       * ��� : õ�簰�� ����ϰ� ������ �����ϰ� ������� ����.
       * 
       */

//	   ��������� �ʱ�ȭ!
//	   int num = 0;  
////	   String ���� �޽��� �ۼ�! result ����� ����~
//	   String title = "Q. ����� �����ϴ� ���� ����ΰ���?" ,result = null ;
//	   String menu = "1. ������ \n" + "2. ����� \n" + "3. ������ \n" + "4. ��� \n"  ;
////	   ����� �޾���
//	   String redMsg = ". ������ : �Ұ��� �������̰� �������̴�." , yelMsg = ". ����� : �߶��ϰ� ��� �Ϳ��� �����ְ� ���ϴ�." ,
//			  blaMsg = ". ������ : �����ϰ� ����ϰ� ��ö�ϰ� ������.", whiMsg = ". ��� : õ�簰�� ����ϰ� ������ �����ϰ� ������� ����." ;		   
//	   Scanner sc = new Scanner(System.in);
//	   
//	   System.out.println(title);
//	   System.out.println(menu);
//	   num = sc.nextInt();
//	    
////	   1�̸� 1�� ���� 1�� �ƴϸ� ������ȣ��! ( 5�����ʹ� �߸��Է��ϼ̽��ϴٷ� �Է�!)
//	   result = num == 1 ? num + redMsg : num == 2 ?  num + yelMsg 
//			  : num == 3 ?  num +blaMsg : num == 4 ? num + whiMsg 
//					   : num + ". �߸� �Է��ϼ̽��ϴ�." ; 
//	   
//	   System.out.println(result);
	   
	   String message = "Q. ����� �����ϴ� ���� �����ϼ���.";
	      String choiceMessage = "1.������\n2.�����\n3.������\n4.���";
	      String redMessage = "�Ұ��� �������̰� �������̴�."; 
	      String yellowMessage = "�߶��ϰ� ��� �Ϳ��� �����ְ� ���ϴ�."; 
	      String blackMessage = "�����ϰ� ����ϰ� ��ö�ϰ� ������."; 
	      String whiteMessage = "õ�簰�� ����ϰ� ������ �����ϰ� ������� ����.";
	      String errorMessage = "�ٽ� �Է����ּ���.";
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