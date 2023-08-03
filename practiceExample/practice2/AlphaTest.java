package practiceExample.practice2;

public class AlphaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = (int)(Math.random()*26)+1;
		char str = (char)(num+64);
		
		System.out.println("추출된 숫자 :"+num);
		System.out.println(str);
	}
	
}
