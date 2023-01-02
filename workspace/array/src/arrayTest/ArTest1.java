package arrayTest;

public class ArTest1 {
	public static void main(String[] args) {
		int[] arData = {2,4,5,6,8};
		System.out.println(arData);
		System.out.println(arData.length);
		
//		for (int i= 0; i <5; i++) {
//			System.out.println(arData[i]);
//		}
//		
//		
////		5,4,3,2,1 을 넣고 출력
//		
		int[] arData1 = {5,4,3,2,1};
		for (int i=0; i <5; i++) {
			System.out.print(arData1[i]+" ");
		}
		for (int i =0; i<5 ; i++) {
			arData[i] = 5-i;
		}
		for (int i =0; i <5; i++) {
			System.out.println(arData[i]);
		}
		
//		int[] arNumber = new int[5];
//		for(int i =0; i<arNumber.length; i++) {
//			arNumber[i] = 5 -i;
//			System.out.println(arNumber[i]);
		}
	}


