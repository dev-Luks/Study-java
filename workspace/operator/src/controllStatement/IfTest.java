package controllStatement;

import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {
//      �� ���� ��Һ�
      int firstNumber = 0, lastNumber = 0;
      String message = "���� �� ���� �Է��ϼ���", result = null;
      Scanner sc = new Scanner(System.in);
      
      System.out.println(message);
      firstNumber = sc.nextInt(); 
      lastNumber = sc.nextInt();
   
//      if(firstNumber >lastNumber) {
//    	  System.out.println("ū��: " + firstNumber);
//      }else if(firstNumber != lastNumber) {
//    	  System.out.println("ū ��: " + lastNumber);
//      }else {
//    	  System.out.println("�� ���� �����ϴ�.");
//      }
//     
      if(firstNumber >lastNumber) {
    	  result = "ū ��: " + firstNumber;
      }else if(firstNumber != lastNumber) {
    	  result = " ū ��: " + lastNumber;
      }else {
    	  result= "�� ���� �����ϴ�.";
      }
      System.out.println(result);
      
	}

}