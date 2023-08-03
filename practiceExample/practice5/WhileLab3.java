package practiceExample.practice5;

public class WhileLab3 {
	public static void main(String[] args) {
		int n;
		int help = 64;
		int count=0;
		
		while(true) {
			n = (int)(Math.random()*31); //0~30
			if(n==0 || n>=27)
				break;
			System.out.printf("%d-%c,%2$d,0x%2$x%n",n,(n+help));
			++count;
		}
		System.out.printf("출력횟수는 %d 번입니다.",count);
	}
}
