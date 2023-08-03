package practiceExample.practice6;

public class ArrayLab1 {
	public static void main(String[] args) {
		int[] ary = new int[10];
		
		for(int i : ary)
			System.out.print(i+" ");
		
		for(int i=0; i < ary.length; i++)
            ary[i] = (i+1)*10;
		
		System.out.printf("%n첫 번째 : %d%n마지막 : %d%n합 : %d%n"
							,ary[0],ary[9],(ary[0]+ary[9]));
		
		for(int i : ary)
			System.out.print(i+" ");
		System.out.println();

		for(int i=ary.length-1; i>=0; i--)
			System.out.print(ary[i]+" ");
		System.out.println();
		
		for(int i=1;i<ary.length;i+=2)
			System.out.print(ary[i]+" ");

			
	}
}
