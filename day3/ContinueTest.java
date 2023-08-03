package day3;

public class ContinueTest {

	public static void main(String[] args) {
		int num;
		
		while(true) {
			num = (int)(Math.random()*31);// 0~30
			
			if (num == 0) {
				System.out.println("\n종료");
				break; // 반복문 탈출
			}
			if (num > 26) {
				System.out.println('@');
				continue; // 뒤의 식 상관없이 위의 조건식으로 점프
			}
			System.out.printf("%d(%c)", num, (char)(96+num));				
		}
	}
}
