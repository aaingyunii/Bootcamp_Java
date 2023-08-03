package day3;

public class BreakTest2 {      

	public static void main(String[] args) {
		int result;
		
		unico: for(int dan = 1; dan <= 9; dan++) {
			for(int num=1; num <= 9; num++) {
				result = dan*num;
				if (result >= 30)
					break unico;
				/**
				 * "'unico' 라는 레이블로 정의한 반복문을 break" 의미
				 * 위의 식에서 dan 변수로 돌아가는 반복문을 탈출하는 것.
				 * 
				 * 이렇게 레이블을 지정해서 특정 구간에 대한 부분 제어가 가능하다.
				 */
				System.out.print(dan + "x" + num + "=" + result + "\t");
			}
			System.out.println();
		}		
	}
}
