package practiceExample.practice5;

public class ControlLab3 {
	public static void main(String[] args) {
		int X;
		
		while(true) {
			X = (int)(Math.random()*120)+1;
			
			if(X<50) {
				System.out.printf("%d : 50 미만%n",X);
//				if(X==3 || X == 13 || X == 33 || X ==43)
				if(X%10==3)
					System.out.printf("\t%d : *듀크팀*%n",X);
			}
			else if(X>=50 && X<=80) {
				System.out.printf("%d : 50 이상 80이하%n",X);
				if(X>=70 && X<=79)
					System.out.printf("\t%d : *턱시팀*%n",X);
			}
			else if(X>=81 && X<=100)
				continue;
			else
				break;
		}
	}
}
