package practiceExample.practice8;

public class MethodLab4 {
	public static void main(String[] args) {	
		int count =5;
		
		for(int i=0;i<count;i++) {
			System.out.print(getRandom(10));
			
			if(i!=(count-1))
				System.out.print(",");
		}
		System.out.println();
		
		for(int i=0;i<count;i++) {
			System.out.print(getRandom(10,20));
			
			if(i!=(count-1))
				System.out.print(",");
		}
	}
	
	public static int getRandom(int n) {
		return (int)(Math.random()*n)+1;
	}
	public static int getRandom(int n1, int n2) {
		return (int)(Math.random()*(n2-n1+1))+n1;
	}
}
