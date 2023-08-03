package practiceExample.practice4;

public class ForLab8 {
	public static void main(String[] args) {
		final String sign = "**********";
		String space = " ";
		
		
		System.out.println(sign);
		for(int i=1;i<6;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(space);
			}
			System.out.print(sign);
			System.out.println();
		}
	}
}
