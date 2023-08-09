package day7;

public class RuntimeTest {
	public static void main(String[] args) throws Exception {
		Runtime r = Runtime.getRuntime(); // new Runtime();
		Runtime r1 = Runtime.getRuntime();
		Runtime r2 = Runtime.getRuntime();
		
		// 참조값이 다 똑같다
		System.out.println(r);
		System.out.println(r1);
		System.out.println(r2);
		
		r.exec("c:/windows/notepad.exe");
	}
	
	
}
