package day7;

public class InputTest {
	public static void main(String[] args) throws Exception{
//		System.out.print("입력 : ");
//		int input = System.in.read(); // 한 문자만 읽는다.
//		System.out.println((char)input);
		
		System.out.print("입력2 : ");
		int input2 = new java.io.InputStreamReader(System.in).read();
		System.out.println((char)input2);
	}
}
