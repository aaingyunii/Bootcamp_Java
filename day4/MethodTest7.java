package day4;
public class MethodTest7 {
	public static void main(String[] args) {
		System.out.println("main() 수행시작");
		System.out.println(args.length);
		
		// args -> 빈배열을 전달받는다.
		System.out.println(args[0]+args[1]+args[2]);
		System.out.println("main() 수행종료");
	}	
}
