package threadTest;

public class Zoo {
//	[�ǽ�]
//			�����̳� ���������� 3������ ������ �ִ�.
//			�� ������ ���� �Ҹ��� �ٸ��� 2������ ������ ���ÿ� ���.
//			������ 1���� ������ 2���� ������ ��� ��� ���� �������� ���.
//
//			package���� threadTask���� ����� Ŭ������ 2���� �����Ѵ�.
//			�ϳ��� Ŭ�������� main �����尡 �ִ�.
//			Runnable �������̽��� ��Ƽ �����带 �����ϰ� �ݵ�� join()�� ����Ѵ�.
//			�� �� ������ 10������ ���.
//
//
//			- �ּ��� �ۼ��Ͽ��°�
//			- Thread�� name�ʵ带 ����� �� �ִ°�
//			- �迭�� ����Ͽ��°�
//			- Ŭ������ �� �� �����Ͽ��°�
//			- ������ : ���ٽ��� ����Ͽ��°�, main �����带 ����Ͽ��°�      	   
	   public static void main(String[] args) {
//	      ���ٽ����� run() ������
	      Runnable animal = () -> {
	         for (int i = 0; i < 10; i++) {
	            System.out.println(Thread.currentThread().getName());
	            try {Thread.sleep(400);} catch (InterruptedException e) {;}
	         }
	      };
	      
//	      ������ animal ��ü�� makeSounds�� ����
	      new Animal().makeSounds(animal);
	   
	}
}
