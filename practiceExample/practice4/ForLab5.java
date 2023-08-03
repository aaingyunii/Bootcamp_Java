package practiceExample.practice4;

public class ForLab5 {
	public static void main(String[] args) {
		int x = (int)(Math.random()*8)+3; //3~10
		int y = (int)(Math.random()*3)+1; //1~3
		char sign;
		
		switch(y) {
		case 1:
			sign='*';
			break;
		case 2:
			sign='$';
			break;
		default:
			sign='#';
		}
		
		for(int i=0;i<x;i++)
			System.out.printf("%c",sign);
		
	}
}
