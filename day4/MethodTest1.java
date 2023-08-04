package day4;

public class MethodTest1 {
	public static void main(String[] args) {
		System.out.println("main() 수행시작");
		printMyName();
		System.out.println(1);
		printMyName();
		System.out.println(2);
		printMyName();
		System.out.println(3);
		System.out.println("main() 수행종료");
	}
	
	static void printMyName() { // static -> 제어자
		System.out.println("안인균");
		return;
	}
}
