package codingTest;

public class CodingTest1 {
	
	public int result(String number) {
//	      ���ӵǴ� 1�� �ִ� ���� ���ϱ�
//	      0�� ���ְ� �迭�� ����ֱ�
	      String[] numbers = number.split("0");
	      
//	      ó�� �迭�� ���̸� ����ֱ�
	      int result = numbers[0].length();
	      
	      for (int i = 0; i < numbers.length; i++) {
//	            ����� ���̺��� �� ��ٸ� �ٽ� ����ش�.
	            if(result < numbers[i].length()) {
	               result = numbers[i].length();
	            }
	      }
	      return result;
	   }
	   
	   
	   public static void main(String[] args) {
	      String number = "00111000011111111111111111111111111011011111110010011";
	      int result = 0;
	      CodingTest1 c = new CodingTest1();
	      
	      result = c.result(number);
	      System.out.println(result);
	   
	}

}
