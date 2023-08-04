package practiceExample.practice7;

public class LottoMachine {
	public static void main(String[] args) {
		int n;
		boolean check;
		int[] lotto = new int[6];
		
		for(int i=0;i<lotto.length;i++) {
			// 매 for문마다 초기화하여 똑같은 조건 형성.
			n = (int)(Math.random()*45)+1;
			check = false; 
			
			for(int j=0;j<=i;j++) {				
				if(lotto[j]!=n)
					check=true;
				else {
					check=false;
					break; // 중복중복중복 이다 마지막 원소가 중복이 아니라면
							// 결론적으로 true를 반환하게 된다.
							// 이를 방지하기 위해 중복을 발견한 순간 break!
				}
			}
			
			if(check)
				lotto[i] =n;
			else
				--i; // 중복된 n값을 뽑은 
					// 인덱스 i에게 다시 뽑을 기회를 준다.
		} 
		
		
		// while문으로도 구현하기
/**		int a=0;
		while(a<lotto.length) {
			n = (int)(Math.random()*45)+1;
			check = false;
			
			for(int j=0;j<=a;j++) {				
				if(lotto[j]!=n)
					check=true;
				else {
					check=false;
					break;
				}
			}
			if(check) {
				lotto[a] =n;
				++a;
			}
		}
*/		
		
		System.out.print("오늘의 로또 번호 - ");		
		for(int i=0;i<lotto.length;i++) {
			if(i!=lotto.length-1) 
				System.out.print(lotto[i]+",");
			else 
				System.out.print(lotto[i]);
		}
		
	}
}
