package day2;

public class ForTest2 {
	public static void main(String[] args) {
		 double rand; // 반복문내에서 선언하고 초기화하면 쓸모없는 메모리 낭비 발생.
		 
		 for(int num=1; num <= 10; num++) { 
			rand = Math.random();
		 	System.out.println(rand);
		 	System.out.println(rand*6);
		 	System.out.println((int)(rand*6));
//		 	0부터 5까지의 난수 만드는 과정
		 	System.out.println(num+"번째 반복 종료.\n");
		 }
		 System.out.println("For문 종료.");
	}
}
