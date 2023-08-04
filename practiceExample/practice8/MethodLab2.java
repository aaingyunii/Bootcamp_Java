package practiceExample.practice8;

public class MethodLab2 {
	public static void main(String[] args) {
//		String a = (isEven(10)) ? "짝수":"홀수";
//		System.out.println("10은 "+a+" 입니다.");
//		
//		String b = (isEven(13)) ? "짝수":"홀수";
//		System.out.println("13은 "+b+" 입니다.");
		
//		char x = (isEven(10)) ? '짝':'홀';
//		char y = (isEven(13)) ? '짝':'홀';
//		System.out.println("10은 "+x+"수 입니다.");
//		System.out.println("13은 "+y+"수 입니다.");
		
		//삼항 연산자의 우선순위가 문제 원인
		// 삼항 연산자의 우선순위는 '+'보다 낮기 때문에
		// 먼저 연산이 수행되어 이상한 결과가 나타납니다.
		// 따라서 삼항 연산자 부분을 () 묶어 우선순위를 +연산 보다 먼저 한다.
		System.out.println("10은 "+ (isEven(10) ? "짝수":"홀수") +" 입니다.");
		System.out.println("13은 "+ (isEven(13) ? "짝수":"홀수") +" 입니다.");

	}
	
	static boolean isEven(int a) {
		if(a%2==0)
			return true;
		else
			return false;
	}
}
