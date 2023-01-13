package codingTest;
//
//public class OneOrZero {
//	 public int result(String number) {
////	      ���ӵǴ� 1�� �ִ� ���� ���ϱ�
////	      0�� ���ְ� �迭�� ����ֱ�
//	      String[] OneOrZero = number.split("0");
//	      
////	      ó�� �迭�� ���̸� ����ֱ�
//	      int result = OneOrZero[0].length();
//	      
//	      for (int i = 0; i < OneOrZero.length; i++) {
////	            ����� ���̺��� �� ��ٸ� �ٽ� ����ش�.
//	            if(result < OneOrZero[i].length()) {
//	               result = OneOrZero[i].length();
//	            }
//	      }
//	      return result;
//	   }
//	   
//	   
//	   public static void main(String[] args) {
//	      String number = "00111000011111111111111111111111111011011111110010011";
//	      int result = 0;
//	      OneOrZero c = new OneOrZero();
//	      
//	      result = c.result(number);
//	      System.out.println(result);
//	   }
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class OneOrZero {
   public int solution(String s) {
      int result = 0;
      
      List<Integer> results = new ArrayList<String>(Arrays.asList(s.split("0")))
            .stream().map(String::length).sorted(Collections.reverseOrder())
            .collect(Collectors.toList());
//      try {
//         result = new ArrayList<String>(Arrays.asList(s.split("0")))
//               .stream().map(String::length).sorted(Collections.reverseOrder())
//               .collect(Collectors.toList()).get(0);
//      } catch (Exception e) {
//         result = 0;
//      }
      return results.size() == 0 ? 0 : results.get(0);
   }
   
   public static void main(String[] args) {
      String s = "00000";
      System.out.println(new OneOrZero().solution(s));
   }
}

	   

}
