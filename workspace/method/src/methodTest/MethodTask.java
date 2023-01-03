package methodTest;

import java.util.Scanner;

import com.sun.swing.internal.plaf.metal.resources.metal;

public class MethodTask {
//	1~10까지 println()으로 출력하는 메소드
	void print(){
		for(int i =0; i<10; i++) {	
			System.out.print(i+1+ " ");
		}		
	}	
	
//	"홍길동"을 n번 println()으로 출력하는 메소드
		void printHong(int n){
			for(int i =0; i<n; i++) {
				System.out.print("홍길동"+ " ");
			}
		} 
	
//	이름을 n번 println()으로 출력하는 메소드
		void printName(String name, int n){
			for(int i =0; i<n; i++) {
				System.out.println(name);
			}
			
		}
//	세 정수의 뺄셈을 해주는 메소드
		int printNum(int num1, int num2, int num3) {
//			int result = 0;
			int result = num1 - num2 - num3;
			return result;			
		}
//	 두 정수의 나눗셈 후 몫과 나머지 두개를 구하는 메소드  ( % , /)	
		int[] div(int num1, int num2) {
			
			int share = num1 / num2;
			int remainder = num1 % num2;
			int[] arData = {share, remainder};
			return arData;
		}

//		1~n까지의 합을 구해주는 메소드
		void printPlus(int n){	
			int sum = 0;
			for(int i = 0; i<n; i++) {	
				sum += i+1;
			}
			System.out.println(sum);
		}
		
//		홀수를 짝수로, 짝수를 홀수로 바꿔주는 메소드
		void printOddEven(int value ) {
			int result = 0;
			if(value % 2 ==1  ) { //홀수일때
				result = value+1;				
			}else if (value % 2 ==0 ) { //짝수일때
				result = value +1;
			}
			System.out.println(result);
		}
		
//		문자열을 입력받고 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드
		String printCaplow(String letter) {   //대문자 + 65 , 소문자 +97 char사용 i 			
			String result = "";
		

			
			for(int i = 0 ; i< letter.length(); i++) {
				char c = letter.charAt(i);
				if(c >=65 && c <= 90) { //소문자로 변경해서 result에 대입한다.
//					result = result +(char)(c +32);
					result +=(char)(c+32);
				} else if(c >= 97 && c<= 122) { //대문자로 변경해서 대입한다.
//					result = result + (char)(char-32);
					result += (char)(c-32);
				}else	{				//알파벳이 아니면 
//					result = result +c;
					result += c;
				}
			
			}
			return result;
		}
		
//		문자열을 입력받고 원하는 문자의 개수를 구해주는 메소드
//		5개의 정수를 입력받은 후 원하는 인덱스의 값을 구하는 메소드
//		한글을 정수로 바꿔주는 메소드(일공이사 - > 1024)
//		5개의 정수를 입력받고 최대값과 최소값을 구해주는 메소드
//		5개의 정수를 입력받고 최대값과 최소값을 구해주는 메소드(void)
		
		
//	public static void main(String[] args) {
//		MethodTask methodTask = new MethodTask();
//		methodTask.print();
//		methodTask.printHong(5);
//		methodTask.printName("김욱성",5);
//		System.out.println(methodTask.printNum(5, 7, 3));
//		System.out.println("몫: "+ methodTask.div(5,3)[0]);
//	System.out.println("나머지: " +methodTask.div(5,3)[1]);
//		methodTask.printPlus(7);
//		methodTask.printOddEven(8);
//	}	
//	 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		
	//   1~10까지 println()으로 출력하는 메소드
			   void printFrom1To10() {
			      for (int i = 0; i < 10; i++) {
			         System.out.println(i + 1);
			      }
			   }

			//   "홍길동"을 n번 println()으로 출력하는 메소드
			   void printHong(int count) {
			      for (int i = 0; i < count; i++) {
			         System.out.println("홍길동");
			      }
			   }

			//   이름을 n번 println()으로 출력하는 메소드
			   void printName(String name, int count) {
			      for (int i = 0; i < count; i++) {
			         System.out.println(name);
			      }
			   }

			//   세 정수의 뺄셈을 해주는 메소드
			   int sub(int number1, int number2, int number3) {
			      int result = number1 - number2 - number3;
			      return result;
			   }

			//   두 정수의 나눗셈 후 몫과 나머지 두 개를 구하는 메소드
			   int[] div(int number1, int number2) {
			      int[] result = null;

			      if (number2 != 0) {
			         result = new int[2];
			         result[0] = number1 / number2;
			         result[1] = number1 % number2;
			      }
			      return result;
			   }
	//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
			   
			//   1~n까지의 합을 구해주는 메소드
			   int getTotalFrom1(int end) {
			      int total = 0;
			      for (int i = 0; i < end; i++) {
			         total += i + 1;
			      }
			      return total;
			   }

			//   홀수를 짝수로, 짝수를 홀수로 바꿔주는 메소드

					   
			   int change(int number) {
			      return ++number;
			   }

			//   문자열을 입력받고 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드
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

			//   문자열을 입력받고 원하는 문자의 개수를 구해주는 메소드
			   int getCount(String str, char c) {
			      int count = 0;
			      for (int i = 0; i < str.length(); i++) {
			         if (str.charAt(i) == c) {
			            count++;
			         }
			      }
			      return count;
			   }

			//   5개의 정수를 입력받은 후 원하는 인덱스의 값을 구해주는 메소드
			   int getValue(int[] arData, int index) {
			      return arData[index];
			   }

			//   한글을 정수로 바꿔주는 메소드(일공이사 -> 1024)
			   int changeToInteger(String hangle) {
			      String hangleOriginal = "공일이삼사오육칠팔구";
			      String result = "";
			      for (int i = 0; i < hangle.length(); i++) {
			         result += hangleOriginal.indexOf(hangle.charAt(i));
			      }
			      return Integer.parseInt(result);
			    }

			//   5개의 정수를 입력받고 최대값과 최소값을 구해주는 메소드
			   int[] getMaxAndMin(int[] arData) {
			      int[] result = {arData[0], arData[0]};
			      
			      for (int i = 0; i < arData.length; i++) {
			         if(result[0] < arData[i]) {result[0] = arData[i];} 
			         if(result[1] > arData[i]) {result[1] = arData[i];} 
			      }
			      return result;
			   }
			   
			//   5개의 정수를 입력받고 최대값과 최소값을 구해주는 메소드(void)
			   void getMaxAndMin(int[] arData, int[] result) {
			      result[0] = arData[0];
			      result[1] = arData[0];
			      
			      for (int i = 0; i < arData.length; i++) {
			         if(result[0] < arData[i]) {result[0] = arData[i];} 
			         if(result[1] > arData[i]) {result[1] = arData[i];} 
			      }
			   }
			//   문자열을 입력받고 원하는 문자의 개수를 구해주는 메소드
			   int getCount(String str, char c) {
			      int count = 0;
			      for (int i = 0; i < str.length(); i++) {
			         if (str.charAt(i) == c) {
			            count++;
			         }
			      }
			      return count;
			   }
			   
			   
			//   indexOf() 만들기
			//   문자열과 문자를 입력받은 뒤 해당 문자가 몇 번째 인덱스에 있는 지 검사하고
			//   만약 해당 문자가 없으면 -1을 리턴한다.
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
////			      methodTask.printName("한동석", 5);
////			      System.out.println(methodTask.sub(5, 5 , 10));
////			      int[] result = methodTask.div(10, 0);
////			      if (result == null) {
////			         System.out.println("0으로 나눌 수 없습니다.");
////			      } else {
////			         System.out.println("몫: " + result[0]);
////			         System.out.println("나머지: " + result[1]);
////			      }
//			      int[] result = new int[2];
//			      int[] arData = {3, 5, 6, 2, 1};
//			      methodTask.getMaxAndMin(arData, result);
//			      System.out.println("최대값: " + result[0]);
//			      System.out.println("최소값: " + result[1]);
		      int index = methodTask.indexOf("ABC", 'B');
		      System.out.println(index);
		      
			   }
}
