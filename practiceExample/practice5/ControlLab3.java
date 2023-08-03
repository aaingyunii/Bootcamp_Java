package practiceExample.practice5;

public class ControlLab3 {
	public static void main(String[] args) {
		int x;
		
		while(true) {
			x = (int)(Math.random()*120)+1;
			
			if(x<50) {
				System.out.printf("%d : 50 미만%n",x);
//				if(x==3 || x == 13 || x == 33 || x ==43)
				if(x%10==3)
					System.out.printf("\t%d : *듀크팀*%n",x);
			}
			else if(x>=50 && x<=80) {
				System.out.printf("%d : 50 이상 80이하%n",x);
				if(x>=70 && x<=79)
					System.out.printf("\t%d : *턱시팀*%n",x);
			}
			else if(x>=81 && x<=100)
				continue;
			else
				break;
		}
	}
}
