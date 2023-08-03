package practiceExample.practice5;

public class ControlLab1 {
	public static void main(String[] args) {
		int n;
		int count=0;
		int sum;
		
		while(true) {
			n = (int)(Math.random()*11)+10;
			sum=0;
			
			if(n==11 || n==17 || n==19) 
				break;
			else if(n%3==0 || n%5==0) {
				for(int i=1;i<=n;i++) 
					sum +=i;
				System.out.println("합계 :"+sum);
			}else {
				System.out.println("재수행");
				continue;
			}
			
			++count;
		}
		
		System.out.printf("총 %d 회 반복함.",count);
	}
}
