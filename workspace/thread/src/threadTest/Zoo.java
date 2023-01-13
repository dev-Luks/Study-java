package threadTest;

public class Zoo {
//	[실습]
//			동석이네 동물원에는 3마리의 동물이 있다.
//			각 동물은 울음 소리가 다르고 2마리의 동물은 동시에 운다.
//			나머지 1마리 동물은 2마리 동물이 모두 울고 나서 마지막에 운다.
//
//			package명은 threadTask으로 만들고 클래스는 2개만 선언한다.
//			하나의 클래스에는 main 쓰레드가 있다.
//			Runnable 인터페이스로 멀티 쓰레드를 구현하고 반드시 join()을 사용한다.
//			※ 각 동물은 10번씩만 운다.
//
//
//			- 주석을 작성하였는가
//			- Thread의 name필드를 사용할 수 있는가
//			- 배열을 사용하였는가
//			- 클래스를 두 개 선언하였는가
//			- 가산점 : 람다식을 사용하였는가, main 쓰레드를 사용하였는가      	   
	   public static void main(String[] args) {
//	      람다식으로 run() 재정의
	      Runnable animal = () -> {
	         for (int i = 0; i < 10; i++) {
	            System.out.println(Thread.currentThread().getName());
	            try {Thread.sleep(400);} catch (InterruptedException e) {;}
	         }
	      };
	      
//	      구현된 animal 객체를 makeSounds에 전달
	      new Animal().makeSounds(animal);
	   
	}
}
