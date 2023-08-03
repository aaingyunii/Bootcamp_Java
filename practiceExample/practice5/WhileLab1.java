package practiceExample.practice5;

public class WhileLab1 {
	public static void main(String[] args) {
		int count = (int)(Math.random()*6)+5;
		int a =1;
		
		System.out.println("For문");
		for(int i=1;i<=count;i++)
			System.out.println(i+" -> "+i*i);
		
		System.out.println("\nWhile문");
		while(a<=count) {
			System.out.println(a+" -> "+a*a);
			++a;
		}
	}
}
