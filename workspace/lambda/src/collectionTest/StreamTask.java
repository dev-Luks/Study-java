package collectionTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.IntStream;



public class StreamTask {
	public static void main(String[] args) {
//		10~1까지 ArrayList에 담고 출력
//		ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(10,9,8,7,6,5,4,3,2,1));
		ArrayList<Integer>	datas = new ArrayList<Integer>();
//		IntStream.range(0, 11).forEach(data -> System.out.println(data));
		IntStream.rangeClosed(0, 10).forEach(v ->datas.add(10-v));
		System.out.println(datas);
		
//		1~10까지 ArrayList에 담고 출력
		ArrayList<Integer> datas1 = new ArrayList<Integer>();
		IntStream.range(0,11).forEach(datas1::add);
		System.out.println(datas1);

//		ABCDEF를 각 문자별로 출력
		"ABCDEF".chars().forEach(c -> System.out.print((char)c));
		System.out.println();
		IntStream.rangeClosed('A', 'F').forEach(c ->System.out.print((char)c));
		System.out.println();
		
//		1~100까지 중 홀수만 ArrayList에 담고 출력
		ArrayList<Integer> number = new ArrayList<Integer>();
		
//		IntStream.range(1, 51).forEach( n ->number.add((n*2)-1));
//		System.out.println(number);		
		IntStream.range(1, 51).map(n -> (n*2)-1).forEach(number::add);
		System.out.println(number);
		
//		A~F까지 중 D제외하고 ArrayList에 담고 출력 (map사용)
		IntStream.rangeClosed('A', 'E').map(c -> c>67 ? c+1 :c).forEach(c-> System.out.print((char)c));
		System.out.println();
		
//		5개의 문자열을 모두 소문자로 변경(Black, WHITE, reD,yeLLow, PINK)(map사용), toLowerCase()
		ArrayList<String> colors = new ArrayList<>(Arrays.asList("Black", "WHITE", "reD","yeLLow","PINK"));
		colors.stream().map(s -> s.toLowerCase()).forEach(v -> System.out.print(v + " "));
								//String ::toLowerCase
		System.out.println();
		
//		1~100까지 중 홀수만 ArrayList에 담고 출력(filter)
		IntStream.rangeClosed(1, 100).filter(n -> n%2 == 1).forEach( n -> System.out.print(n+ " "));
		System.out.println();
		
//		Apple, banana, Melon 중 첫번째 문자가 대문자인 문자열 출력
//		ArrayList<String> fruits = new ArrayList<>(Arrays.asList("Apple","banana","Melon"));
//		fruits.stream().filter(f -> charAt(0) >= 'A').filter(f ->charAt(0) <='Z')
//		.forEach(System.out::println);
		
////      Apple, banana, Melon 중 첫번째 문자가 대문자인 문자열 출력
//      ArrayList<String> datas = new ArrayList<String>(Arrays.asList("Apple", "banana", "Melon"));
//      datas.stream()
//         .filter(data -> data.charAt(0) >= 'A')
//            .filter(data -> data.charAt(0) <= 'Z')
//               .forEach(System.out::println);

		
//      한글을 정수로 변경
//      String hangle = "공일이삼사오육칠팔구";
//      String data = "일공이사";
//      data.chars().map(hangle::indexOf).forEach(System.out::print);

		
//      정수를 한글로 변경
//      String hangle = "공일이삼사오육칠팔구";
//      String data = "1024";
//      StreamTask streamTask = new StreamTask();
//      data.chars().map(streamTask::change).forEach(i -> System.out.print(hangle.charAt(i)));

		
	}
}