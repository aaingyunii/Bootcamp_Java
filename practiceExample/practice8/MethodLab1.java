package practiceExample.practice8;

public class MethodLab1 {
	public static void main(String[] args) {
		printTitle();
		System.out.printf("%n가격은 %,d원입니다.",getPrice());
	}
	
	static void printTitle() {
		System.out.print("우리의 자바교재명은 <혼자 공부하는 자바>입니다.");
	}
	static int getPrice() {
		int price = 24000;
		return price;
	}
}
