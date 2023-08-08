package day6;
//다형성 관련 내용

public class PolyTest {
	
	static void printObjectInfo(Object o) { // 다형성   
		if(o instanceof String)
			System.out.println("문자열 객체 전달됨-"+o.toString()+"-"
					+((String) o).length());
		else 
			System.out.println("전달된 객체의 클래스명: "+o.getClass().getName());			
		
	}
	
	public static void main(String[] args) {
		printObjectInfo(new Object());
		printObjectInfo("ABC");
		printObjectInfo(new String("가나다"));
		printObjectInfo(new java.io.File("c:\\javastudy"));
		printObjectInfo(new java.util.Date());
		printObjectInfo(new int[10]);
		printObjectInfo(new double[5]);
		printObjectInfo(new Integer(100));
		printObjectInfo(100);
		printObjectInfo(3.14);
	}
	
}
