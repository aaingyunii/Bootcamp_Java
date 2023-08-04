package practiceExample.practice8;

public class MethodLab5 {
	public static void main(String[] args) {
		int[] p1 = {10,20,30};
		int[] p2 = {100,500,300,200,400};
		int[] p3 = {1, 10, 3, 4, 5, 8, 7, 6, 9, 2};
		
		System.out.printf("가장 큰 값은 %d 입니다.%n",maxNumArray(p1));
		System.out.printf("가장 큰 값은 %d 입니다.%n",maxNumArray(p2));
		System.out.printf("가장 큰 값은 %d 입니다.%n",maxNumArray(p3));

	}
	
	static int maxNumArray(int[] p) {
		int max=0;
		
		for(int i:p) {
			if(max<i)
				max=i;
		}
		return max;
	}
}
