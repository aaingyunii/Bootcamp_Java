package day4;
public class MethodTest4_1 {
	public static void main(String[] args) {
		System.out.println("main() 수행시작");
		printMyName(3, '*');
		printMyName("듀크", '$');
		printMyName("듀크", '$');
		printMyName("듀크", '$');
		printMyName("턱시", '!');
		System.out.println("main() 수행종료");
	}	
	static void printMyName(int num, char deco) {
		for(int i=1; i <= num; i++)
			System.out.println(deco+"안인균"+deco);
	}
	// 메서드 오버로딩
	static void printMyName(String name, char deco) {
		System.out.println(deco+name+deco);
	}
}
