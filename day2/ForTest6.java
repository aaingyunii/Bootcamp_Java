package day2;

public class ForTest6 {      

	public static void main(String[] args) {
		final char DECO = '*';
//		final 로 선언 -> 상수, 값이 바뀌지 않는다.		
		int count = (int)(Math.random()*20);
		
		System.out.println(count+" 번 반복할 예정.");
		for(int n=0; n < count; n++)
			System.out.print(DECO);		
	}
}
