package methodTest;

import java.util.Scanner;

import com.sun.swing.internal.plaf.metal.resources.metal;

public class MethodTask {
//	1~10���� println()���� ����ϴ� �޼ҵ�
	void print(){
		for(int i =0; i<10; i++) {	
			System.out.print(i+1+ " ");
		}		
	}	
	
//	"ȫ�浿"�� n�� println()���� ����ϴ� �޼ҵ�
		void printHong(int n){
			for(int i =0; i<n; i++) {
				System.out.print("ȫ�浿"+ " ");
			}
		} 
	
//	�̸��� n�� println()���� ����ϴ� �޼ҵ�
		void printName(String name, int n){
			for(int i =0; i<n; i++) {
				System.out.println(name);
			}
			
		}
//	�� ������ ������ ���ִ� �޼ҵ�
		int printNum(int num1, int num2, int num3) {
//			int result = 0;
			int result = num1 - num2 - num3;
			return result;			
		}
//	 �� ������ ������ �� ��� ������ �ΰ��� ���ϴ� �޼ҵ�  ( % , /)	
		int[] div(int num1, int num2) {
			
			int share = num1 / num2;
			int remainder = num1 % num2;
			int[] arData = {share, remainder};
			return arData;
		}

//		1~n������ ���� �����ִ� �޼ҵ�
		void printPlus(int n){	
			int sum = 0;
			for(int i = 0; i<n; i++) {	
				sum += i+1;
			}
			System.out.println(sum);
		}
		
//		Ȧ���� ¦����, ¦���� Ȧ���� �ٲ��ִ� �޼ҵ�
		void printOddEven(int value ) {
			int result = 0;
			if(value % 2 ==1  ) { //Ȧ���϶�
				result = value+1;				
			}else if (value % 2 ==0 ) { //¦���϶�
				result = value +1;
			}
			System.out.println(result);
		}
		
//		���ڿ��� �Է¹ް� �ҹ��ڴ� �빮�ڷ�, �빮�ڴ� �ҹ��ڷ� �ٲ��ִ� �޼ҵ�
		String printCaplow(String letter) {   //�빮�� + 65 , �ҹ��� +97 char��� i 			
			String result = "";
		

			
			for(int i = 0 ; i< letter.length(); i++) {
				char c = letter.charAt(i);
				if(c >=65 && c <= 90) { //�ҹ��ڷ� �����ؼ� result�� �����Ѵ�.
//					result = result +(char)(c +32);
					result +=(char)(c+32);
				} else if(c >= 97 && c<= 122) { //�빮�ڷ� �����ؼ� �����Ѵ�.
//					result = result + (char)(char-32);
					result += (char)(c-32);
				}else	{				//���ĺ��� �ƴϸ� 
//					result = result +c;
					result += c;
				}
			
			}
			return result;
		}
		
//		���ڿ��� �Է¹ް� ���ϴ� ������ ������ �����ִ� �޼ҵ�
//		5���� ������ �Է¹��� �� ���ϴ� �ε����� ���� ���ϴ� �޼ҵ�
//		�ѱ��� ������ �ٲ��ִ� �޼ҵ�(�ϰ��̻� - > 1024)
//		5���� ������ �Է¹ް� �ִ밪�� �ּҰ��� �����ִ� �޼ҵ�
//		5���� ������ �Է¹ް� �ִ밪�� �ּҰ��� �����ִ� �޼ҵ�(void)
		
		
//	public static void main(String[] args) {
//		MethodTask methodTask = new MethodTask();
//		methodTask.print();
//		methodTask.printHong(5);
//		methodTask.printName("���",5);
//		System.out.println(methodTask.printNum(5, 7, 3));
//		System.out.println("��: "+ methodTask.div(5,3)[0]);
//	System.out.println("������: " +methodTask.div(5,3)[1]);
//		methodTask.printPlus(7);
//		methodTask.printOddEven(8);
//	}	
//	 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
		
	//   1~10���� println()���� ����ϴ� �޼ҵ�
			   void printFrom1To10() {
			      for (int i = 0; i < 10; i++) {
			         System.out.println(i + 1);
			      }
			   }

			//   "ȫ�浿"�� n�� println()���� ����ϴ� �޼ҵ�
			   void printHong(int count) {
			      for (int i = 0; i < count; i++) {
			         System.out.println("ȫ�浿");
			      }
			   }

			//   �̸��� n�� println()���� ����ϴ� �޼ҵ�
			   void printName(String name, int count) {
			      for (int i = 0; i < count; i++) {
			         System.out.println(name);
			      }
			   }

			//   �� ������ ������ ���ִ� �޼ҵ�
			   int sub(int number1, int number2, int number3) {
			      int result = number1 - number2 - number3;
			      return result;
			   }

			//   �� ������ ������ �� ��� ������ �� ���� ���ϴ� �޼ҵ�
			   int[] div(int number1, int number2) {
			      int[] result = null;

			      if (number2 != 0) {
			         result = new int[2];
			         result[0] = number1 / number2;
			         result[1] = number1 % number2;
			      }
			      return result;
			   }
	//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
			   
			//   1~n������ ���� �����ִ� �޼ҵ�
			   int getTotalFrom1(int end) {
			      int total = 0;
			      for (int i = 0; i < end; i++) {
			         total += i + 1;
			      }
			      return total;
			   }

			//   Ȧ���� ¦����, ¦���� Ȧ���� �ٲ��ִ� �޼ҵ�

					   
			   int change(int number) {
			      return ++number;
			   }

			//   ���ڿ��� �Է¹ް� �ҹ��ڴ� �빮�ڷ�, �빮�ڴ� �ҹ��ڷ� �ٲ��ִ� �޼ҵ�
			   String changeToUpperOrLower(String str) {
			      String result = "";
			      for (int i = 0; i < str.length(); i++) {
			         char c = str.charAt(i);
			         if (c >= 65 && c <= 90) {
			            result += (char) (c + 32);

			         } else if (c >= 97 && c <= 122) {
			            result += (char) (c - 32);

			         } else {

			            result += c;
			         }
			      }
			      return result;
			   }

			//   ���ڿ��� �Է¹ް� ���ϴ� ������ ������ �����ִ� �޼ҵ�
			   int getCount(String str, char c) {
			      int count = 0;
			      for (int i = 0; i < str.length(); i++) {
			         if (str.charAt(i) == c) {
			            count++;
			         }
			      }
			      return count;
			   }

			//   5���� ������ �Է¹��� �� ���ϴ� �ε����� ���� �����ִ� �޼ҵ�
			   int getValue(int[] arData, int index) {
			      return arData[index];
			   }

			//   �ѱ��� ������ �ٲ��ִ� �޼ҵ�(�ϰ��̻� -> 1024)
			   int changeToInteger(String hangle) {
			      String hangleOriginal = "�����̻�����ĥ�ȱ�";
			      String result = "";
			      for (int i = 0; i < hangle.length(); i++) {
			         result += hangleOriginal.indexOf(hangle.charAt(i));
			      }
			      return Integer.parseInt(result);
			    }

			//   5���� ������ �Է¹ް� �ִ밪�� �ּҰ��� �����ִ� �޼ҵ�
			   int[] getMaxAndMin(int[] arData) {
			      int[] result = {arData[0], arData[0]};
			      
			      for (int i = 0; i < arData.length; i++) {
			         if(result[0] < arData[i]) {result[0] = arData[i];} 
			         if(result[1] > arData[i]) {result[1] = arData[i];} 
			      }
			      return result;
			   }
			   
			//   5���� ������ �Է¹ް� �ִ밪�� �ּҰ��� �����ִ� �޼ҵ�(void)
			   void getMaxAndMin(int[] arData, int[] result) {
			      result[0] = arData[0];
			      result[1] = arData[0];
			      
			      for (int i = 0; i < arData.length; i++) {
			         if(result[0] < arData[i]) {result[0] = arData[i];} 
			         if(result[1] > arData[i]) {result[1] = arData[i];} 
			      }
			   }
			//   ���ڿ��� �Է¹ް� ���ϴ� ������ ������ �����ִ� �޼ҵ�
			   int getCount(String str, char c) {
			      int count = 0;
			      for (int i = 0; i < str.length(); i++) {
			         if (str.charAt(i) == c) {
			            count++;
			         }
			      }
			      return count;
			   }
			   
			   
			//   indexOf() �����
			//   ���ڿ��� ���ڸ� �Է¹��� �� �ش� ���ڰ� �� ��° �ε����� �ִ� �� �˻��ϰ�
			//   ���� �ش� ���ڰ� ������ -1�� �����Ѵ�.
			   int indexOf(String str, char c) {
			      for (int i = 0; i < str.length(); i++) {
			         if(str.charAt(i) == c) {
			            return i;
			         }
			      }
			      return -1;
			   }

			   public static void main(String[] args) {
			      MethodTask methodTask = new MethodTask();
////			      methodTask.printFrom1To10();
////			      methodTask.printHong(10);
////			      methodTask.printName("�ѵ���", 5);
////			      System.out.println(methodTask.sub(5, 5 , 10));
////			      int[] result = methodTask.div(10, 0);
////			      if (result == null) {
////			         System.out.println("0���� ���� �� �����ϴ�.");
////			      } else {
////			         System.out.println("��: " + result[0]);
////			         System.out.println("������: " + result[1]);
////			      }
//			      int[] result = new int[2];
//			      int[] arData = {3, 5, 6, 2, 1};
//			      methodTask.getMaxAndMin(arData, result);
//			      System.out.println("�ִ밪: " + result[0]);
//			      System.out.println("�ּҰ�: " + result[1]);
		      int index = methodTask.indexOf("ABC", 'B');
		      System.out.println(index);
		      
			   }
}
