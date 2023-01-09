package collectionTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.IntStream;



public class StreamTask {
	public static void main(String[] args) {
//		10~1���� ArrayList�� ��� ���
//		ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(10,9,8,7,6,5,4,3,2,1));
		ArrayList<Integer>	datas = new ArrayList<Integer>();
//		IntStream.range(0, 11).forEach(data -> System.out.println(data));
		IntStream.rangeClosed(0, 10).forEach(v ->datas.add(10-v));
		System.out.println(datas);
		
//		1~10���� ArrayList�� ��� ���
		ArrayList<Integer> datas1 = new ArrayList<Integer>();
		IntStream.range(0,11).forEach(datas1::add);
		System.out.println(datas1);

//		ABCDEF�� �� ���ں��� ���
		"ABCDEF".chars().forEach(c -> System.out.print((char)c));
		System.out.println();
		IntStream.rangeClosed('A', 'F').forEach(c ->System.out.print((char)c));
		System.out.println();
		
//		1~100���� �� Ȧ���� ArrayList�� ��� ���
		ArrayList<Integer> number = new ArrayList<Integer>();
		
//		IntStream.range(1, 51).forEach( n ->number.add((n*2)-1));
//		System.out.println(number);		
		IntStream.range(1, 51).map(n -> (n*2)-1).forEach(number::add);
		System.out.println(number);
		
//		A~F���� �� D�����ϰ� ArrayList�� ��� ��� (map���)
		IntStream.rangeClosed('A', 'E').map(c -> c>67 ? c+1 :c).forEach(c-> System.out.print((char)c));
		System.out.println();
		
//		5���� ���ڿ��� ��� �ҹ��ڷ� ����(Black, WHITE, reD,yeLLow, PINK)(map���), toLowerCase()
		ArrayList<String> colors = new ArrayList<>(Arrays.asList("Black", "WHITE", "reD","yeLLow","PINK"));
		colors.stream().map(s -> s.toLowerCase()).forEach(v -> System.out.print(v + " "));
								//String ::toLowerCase
		System.out.println();
		
//		1~100���� �� Ȧ���� ArrayList�� ��� ���(filter)
		IntStream.rangeClosed(1, 100).filter(n -> n%2 == 1).forEach( n -> System.out.print(n+ " "));
		System.out.println();
		
//		Apple, banana, Melon �� ù��° ���ڰ� �빮���� ���ڿ� ���
//		ArrayList<String> fruits = new ArrayList<>(Arrays.asList("Apple","banana","Melon"));
//		fruits.stream().filter(f -> charAt(0) >= 'A').filter(f ->charAt(0) <='Z')
//		.forEach(System.out::println);
		
////      Apple, banana, Melon �� ù��° ���ڰ� �빮���� ���ڿ� ���
//      ArrayList<String> datas = new ArrayList<String>(Arrays.asList("Apple", "banana", "Melon"));
//      datas.stream()
//         .filter(data -> data.charAt(0) >= 'A')
//            .filter(data -> data.charAt(0) <= 'Z')
//               .forEach(System.out::println);

		
//      �ѱ��� ������ ����
//      String hangle = "�����̻�����ĥ�ȱ�";
//      String data = "�ϰ��̻�";
//      data.chars().map(hangle::indexOf).forEach(System.out::print);

		
//      ������ �ѱ۷� ����
//      String hangle = "�����̻�����ĥ�ȱ�";
//      String data = "1024";
//      StreamTask streamTask = new StreamTask();
//      data.chars().map(streamTask::change).forEach(i -> System.out.print(hangle.charAt(i)));

		
	}
}