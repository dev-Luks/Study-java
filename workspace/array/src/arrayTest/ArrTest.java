package arrayTest;

public class ArrTest {
	public static void main(String[] args) {
		int[][] arrData = {{3,4,5,6},{8,9,0,9},{1,2,3,4}};
		int length = arrData.length * arrData[0].length;
		int length1= 0;
		
		for (int i = 0; i < arrData.length; i++) {
			length1 += arrData[i].length;			
		}
		
		for (int i =0; i< length1; i ++) {
			System.out.println(arrData[i/4][i%4]);
		}
		
	}

}
