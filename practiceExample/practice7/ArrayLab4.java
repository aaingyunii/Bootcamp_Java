package practiceExample.practice7;

public class ArrayLab4 {
	public static void main(String[] args) {
		int n = (int)(Math.random()*6)+5;
		int rand;
		int[] nums = new int[n];
		char[] letters = new char[n];
		
		for(int i=0;i<n;i++) {
			rand = (int)(Math.random()*26)+1;
			nums[i]=rand;
		}
		
		for(int i=0;i<n;i++) 
			letters[i]=(char)(nums[i]+96);
		
		for(int i=0;i<n;i++) {
			System.out.print(nums[i]);
			if(i!=n-1) 
				System.out.print(",");
		}
		System.out.println();
		
		for(int i=0;i<n;i++) {
			System.out.print(letters[i]);
			if(i!=n-1) 
				System.out.print(",");
		}
		
		
	}
}
