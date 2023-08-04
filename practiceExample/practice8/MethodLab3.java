package practiceExample.practice8;

public class MethodLab3 {
	public static void main(String[] args) {
		int x; 
		int y;
		int i = 0;
		
		while(i<5) {
			x = (int)(Math.random()*30)+1;
			y = (int)(Math.random()*30)+1;
			System.out.printf("%d 와 %d 의 차는 %d 입니다.%n"
					,x,y,substractZero(x, y));
			
			i++;
		}
	}
	
	static int substractZero(int a, int b) {
		if(a>b)
			return (a-b);
		else if(a<b)
			return (b-a);
		else
			return 0;
	}
}
