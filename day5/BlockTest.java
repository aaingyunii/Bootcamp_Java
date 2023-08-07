package day5;
public class BlockTest {
	static {
		System.out.println("static 블럭 수행");
	}
	{
		System.out.println("instance 블럭 수행");
	}
	public BlockTest() {     
		System.out.println("생성자 수행");
	}
	
	public static void main(String args[]) {
		// 클래스 로딩은 단 한번만 하므로 맨 처음에 실행되고 다시 로딩되지 않는다.
		// 로딩된 상태로 유지.
		System.out.println("BlockTest bt = new BlockTest(); ");
		BlockTest bt = new BlockTest();
		System.out.println(bt);
		System.out.println();
		
		System.out.println("BlockTest bt2 = new BlockTest(); ");
		BlockTest bt2 = new BlockTest();
		System.out.println(bt2);
	}
}
