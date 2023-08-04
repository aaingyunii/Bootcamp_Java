package practiceExample.practice7;

public class ArrayLab3 {
	public static void main(String[] args) {
		char letters[] = {'J','a','v','a'};
		
		for(int i=0;i<letters.length;i++) {
			if(letters[i]>='A' && letters[i]<='Z')
				letters[i]+=32; // 대문자와 소문자의 10진수 차이가 32이므로
			else
				letters[i] -=32;
		}
		
		for(char c : letters)
			System.out.println(c);
	}
}
