package day2;

public class ForTest3 {

	public static void main(String[] args) {
		for(int n=1; n < 20; n++) 
			System.out.print(n+ " "); // 1부터 19까지 한 행에 출력. 
		System.out.println();
		
		for(int n=10; n > 0; n--)
			System.out.print(n+ " "); // 10부터 1까지 한 행에 출력.
		System.out.println();
		
		for(int n=1; n < 20; n += 3) 
			System.out.print(n+ " "); // 1 4 7,...16, 19 출력 7번 반복.
		System.out.println();
		
		// 1월~12월 까지 하나의 행에 출력해 보자. 
		int month=1;
		for(; month <= 12; month++)
			System.out.print(month+ "월 "); // 1,2,3,...10,11,12. 12번 반복.
		System.out.println();
		System.out.println(month); // 13이 출력. for문 탈출전 ++연산,12+1=13.
		
	}

}
