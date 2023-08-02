package day2;

public class ForTest5 {      

	public static void main(String[] args) {
		char letter = 'A';
		
		for(int n=0; n < 10; n++)
			System.out.print(letter);
		System.out.println("\n----------------");
		
		for(int n=0; n < 10; n++)
			System.out.print(letter++);
		System.out.println("\n----------------");
		
		for(int n=0; n < 10; n++)
			System.out.print(letter++);
		System.out.println("\n----------------");
		
		for(int n=0; n < 6; n++)
			System.out.print(letter++);
		System.out.println("\n----------------");
		
		System.out.println("\n가 시작!");
		letter = '가';
		
		for(int n=0; n < 10; n++) // 사전순처럼 코드값으로 되어있음.
			System.out.print(letter++);
		System.out.println("\n----------------");
		
		for(char m='A';m <= 'Z'; m++)
            System.out.print(m);
	}
}
