package operTest;

import java.util.Scanner;

public class Oper3 {

	public static void main(String[] args) {
//		����ڿ��� Ű�� �Է¹ް�
//		������� ������ ���
//		�Ǽ���� �Ǽ��� ���
//		��) 183 -> 183 ���
//		   183.5 -> 183.5 ���
//		���� �����ڸ� ���!

        
		//		�ϴ� Ű�� �Է¹޾ƾ���
		
		
//		String key = "0";
//		int i = Integer.parseInt(key);
//		double d = Double.parseDouble(key);
//		double result = 0;
//		String message = "����Ű�� �Է��ϼ���" ;
////		Scanner
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println(message);
//		key = sc.next();
//		
//				
////		���׿����� ����غ���
////		������ �¾�? �¾�(�������) : �ƴϾ�(�Ǽ����)
////		�������� 0�̳� 1�� �������� ����, �Ҽ������� �������� �Ǽ� (����������)
////		  �Ǽ���-������ > 0.0 ? ������ : �Ǽ��� 
//		
//		result = (d - i) > 0.0 ?  Integer.parseInt(key) : Double.parseDouble(key) ; 
//		
//		System.out.println(result); 
		
		  double height = 0.0;
	      String message = "Ű: ";
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
