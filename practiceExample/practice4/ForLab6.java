package practiceExample.practice4;

public class ForLab6 {
	public static void main(String[] args) {
		final char sign = '&';
		int count = (int)(Math.random()*6)+5;
		
		if(count==5) {
			for(int i=1;i<6;i++) {
				for(int j=0;j<i;j++) // 한행에 sign을 출력하기 위한 반복문
									// i값이 커지면서 sign 또한 한 행에 여러개를 출력
					System.out.print(sign);
				System.out.println(); // 안쪽 루프탈출 시 다음 루프와 구분짓기 위해
			}
				
		}
		else if(count==7) { // 위와 동일
			for(int i=1;i<8;i++) {
				for(int j=0;j<i;j++)
					System.out.print(sign);
				System.out.println();
			}
		}
	}
}
