package methodTest;

import java.util.Scanner;

import jdk.internal.misc.FileSystemOption;

public class MyMethodTask2 {
//	1~10���� println()���� ����ϴ� �޼ҵ�
	void printOnetoTen() {
		for(int i =0; i< 10; i++) {
			System.out.println(i+1);
		}
	}
	
		
//	"ȫ�浿"�� n�� println()���� ����ϴ� �޼ҵ�
	void printHong(int num) {
		for(int i = 0; i < num; i++) {
			System.out.println("ȫ�浿");
		}
	}
//	�̸��� n�� println()���� ����ϴ� �޼ҵ�
	void printName(String name, int num) {
		for(int i =0; i< num; i++) {
			System.out.println(name);
		}
	}
//	�� ������ ������ ���ִ� �޼ҵ�
	int printSub(int num1, int num2, int num3){
		int result = num1 - num2 - num3;
		return result;
	}
//	 �� ������ ������ �� ��� ������ �ΰ��� ���ϴ� �޼ҵ�  ( % , /)	
//	int[] printdiv(int num1, int num2) {
//		int [] result = null;
//		if(num2 != 0) {
//			result = new int[2];
//			result[0] = num1 / num2 ;
//			result[1] = num1 % num2 ;
//		}
//		return result;		
//	}
	int[] printdiv(int num1, int num2) {
		int[] result = null; //�ּҰ��� ������ ������ �ʿ��ϱ� ������ null�� ����ߴ�.
		if(num2 !=0) {
			result = new int[2]; //result : �����ּ� �ٷιٷλ����ϱ�
			result[0] = num1 / num2;
			result[1] = num1 % num2;
		}
		return result;
		
	}
//		1~n������ ���� �����ִ� �޼ҵ�	
	int printSum(int number) {
		int sum = 0;
		for(int i = 0;i<number; i++ ) {		
//			sum = sum +i+1;
			sum += i+1;
		}
		System.out.println(sum);		
	}
//		Ȧ���� ¦����, ¦���� Ȧ���� �ٲ��ִ� �޼ҵ�
	int Change(int number){
		return ++ number;
	}
//		���ڿ��� �Է¹ް� �ҹ��ڴ� �빮�ڷ�, �빮�ڴ� �ҹ��ڷ� �ٲ��ִ� �޼ҵ�
	String ToUpperOrLower(String str) {		
		String result ="";
		for(int i =0; i<26 ; i++) {
			char c = str.charAt(i);
			if(c>= 65 && c<=90) {
				result += (char)(c+32);
			}else if(c>=97 && c<=122){
				result += (char)(c-32);
			}else {
				result += +c;
		} 	
	}	return result;
	
}	
//		���ڿ��� �Է¹ް� ���ϴ� ������ ������ �����ִ� �޼ҵ�
	int Count(String str, char c) {
		int count = 0;
		for(int i = 0; i<str.length(); i++) {
			if(str.charAt(i) == c) {
				count ++;
			}
		} 
		return count;
	}
//		5���� ������ �Է¹��� �� ���ϴ� �ε����� ���� ���ϴ� �޼ҵ�
	int getValue(int[] arData, int index) {
		return arData[index];
	}
//		�ѱ��� ������ �ٲ��ִ� �޼ҵ�(�ϰ��̻� - > 1024)
	int ChangeHangle(String hangle) {
		String hangleOriginal = "�����̻�����ĥ�ȱ�";
		String result="";
		for(int i = 0; i<hangle.length(); i++) {
			result += hangleOriginal.indexOf(hangle.charAt(i)) ; //������� -1�̳���
		}
		return Integer.parseInt(result);
	}
//		5���� ������ �Է¹ް� �ִ밪�� �ּҰ��� �����ִ� �޼ҵ�
//		5���� ������ �Է¹ް� �ִ밪�� �ּҰ��� �����ִ� �޼ҵ�(void)
	public static void main(String[] args) {
		MyMethodTask2 methodTest = new MyMethodTask2();
//		methodTest.printOnetoTen();
//		methodTest.printHong(7);
//		methodTest.printName("kim", 7);
//		System.out.println(methodTest.printSub(4, 6, 7));
//		int[] result = methodTest.printdiv(10,0);		
//		if(result == null) {
//			System.out.println("0�� �Է��� �� �����ϴ�.");
//		}else {
//			System.out.println("��: " + result[0]);
//			System.out.println("��: "+ result[1]);
//		}
//		methodTest.printSum(9);  //1~n ����
//		System.out.println(methodTest.Change(10));
		
		
//		System.out.println(methodTest.Count("wdRw", 'w')); //���ڿ����� Ư������ ����
//		int[] arData = {5,3,7,6,8};
//		System.out.println(methodTest.getValue(arData,4)); //5���� ������ �Է¹��� �� ���ϴ� �ε����� ���� ���ϴ� �޼ҵ�
//		System.out.println(methodTest.ChangeHangle("�ϰ�����"));
	}
	
}
