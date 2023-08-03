package practiceExample.practice6;

public class ArrayLab2 {
	public static void main(String[] args) {
		int[] nums = new int[10];
		int n;
		int result=0;
		
		for(int i=0;i<nums.length;i++) {
			n = (int)(Math.random()*17)+4;
			nums[i] = n;
		}
		
		System.out.print("모든 원소의 값 : ");
		for(int i : nums)
			System.out.print(i+" ");
		
		for(int i=0;i<nums.length;i++)
			result +=nums[i];
		System.out.println("\n모든 원소의 합 : "+result);
	}
}
