package methodTest;

import java.util.Scanner;

import jdk.internal.misc.FileSystemOption;

public class MyMethodTask2 {
//	1~10까지 println()으로 출력하는 메소드
	void printOnetoTen() {
		for(int i =0; i< 10; i++) {
			System.out.println(i+1);
		}
	}
	
		
//	"홍길동"을 n번 println()으로 출력하는 메소드
	void printHong(int num) {
		for(int i = 0; i < num; i++) {
			System.out.println("홍길동");
		}
	}
//	이름을 n번 println()으로 출력하는 메소드
	void printName(String name, int num) {
		for(int i =0; i< num; i++) {
			System.out.println(name);
		}
	}
//	세 정수의 뺄셈을 해주는 메소드
	int printSub(int num1, int num2, int num3){
		int result = num1 - num2 - num3;
		return result;
	}
//	 두 정수의 나눗셈 후 몫과 나머지 두개를 구하는 메소드  ( % , /)	
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
		int[] result = null; //주소값을 알지만 구분이 필요하기 때문에 null을 사용했다.
		if(num2 !=0) {
			result = new int[2]; //result : 시작주소 바로바로생각하기
			result[0] = num1 / num2;
			result[1] = num1 % num2;
		}
		return result;
		
	}
//		1~n까지의 합을 구해주는 메소드	
	int printSum(int number) {
		int sum = 0;
		for(int i = 0;i<number; i++ ) {		
//			sum = sum +i+1;
			sum += i+1;
		}
		System.out.println(sum);		
	}
//		홀수를 짝수로, 짝수를 홀수로 바꿔주는 메소드
	int Change(int number){
		return ++ number;
	}
//		문자열을 입력받고 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드
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
//		문자열을 입력받고 원하는 문자의 개수를 구해주는 메소드
	int Count(String str, char c) {
		int count = 0;
		for(int i = 0; i<str.length(); i++) {
			if(str.charAt(i) == c) {
				count ++;
			}
		} 
		return count;
	}
//		5개의 정수를 입력받은 후 원하는 인덱스의 값을 구하는 메소드
	int getValue(int[] arData, int index) {
		return arData[index];
	}
//		한글을 정수로 바꿔주는 메소드(일공이사 - > 1024)
	int ChangeHangle(String hangle) {
		String hangleOriginal = "공일이삼사오육칠팔구";
		String result="";
		for(int i = 0; i<hangle.length(); i++) {
			result += hangleOriginal.indexOf(hangle.charAt(i)) ; //없을경우 -1이나옴
		}
		return Integer.parseInt(result);
	}
//		5개의 정수를 입력받고 최대값과 최소값을 구해주는 메소드
//		5개의 정수를 입력받고 최대값과 최소값을 구해주는 메소드(void)
	public static void main(String[] args) {
		MyMethodTask2 methodTest = new MyMethodTask2();
//		methodTest.printOnetoTen();
//		methodTest.printHong(7);
//		methodTest.printName("kim", 7);
//		System.out.println(methodTest.printSub(4, 6, 7));
//		int[] result = methodTest.printdiv(10,0);		
//		if(result == null) {
//			System.out.println("0을 입력할 수 없습니다.");
//		}else {
//			System.out.println("몫: " + result[0]);
//			System.out.println("몫: "+ result[1]);
//		}
//		methodTest.printSum(9);  //1~n 총합
//		System.out.println(methodTest.Change(10));
		
		
//		System.out.println(methodTest.Count("wdRw", 'w')); //문자열에서 특정문자 개수
//		int[] arData = {5,3,7,6,8};
//		System.out.println(methodTest.getValue(arData,4)); //5개의 정수를 입력받은 후 원하는 인덱스의 값을 구하는 메소드
//		System.out.println(methodTest.ChangeHangle("일공삼팔"));
	}
	
}
