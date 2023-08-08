package day6;

// 인터페이스 내 정의된 추상 메서드의 public 지정은 필수!!
interface Printable {
	public static final int PRINT_TYPE1 = 1;
	static final int PRINT_TYPE2 = 2;
	final int PRINT_TYPE3 = 3;
	int PRINT_TYPE4 = 4;
	
	// ; 으로 끝나는 것을 보면 abstract 메서드임을 알 수 있다.
	public abstract void print(int type);
	abstract void setPage(int su);
	boolean isAvailable();
}

abstract class Shape3 {
	String color;

	abstract void draw();

	void setColor(String color) {
		this.color = color;
	}
}

// 부모가 요구되는 자리에 자식이 올 수 있다.
class Circle3 extends Shape3 implements Printable {
	int page;

	void draw() { // Shape3의 메서드 오버라이딩
		System.out.println(color + " 원을 그리는 기능");
	}

	public void print(int type) { // Printable 인터페이스 메서드의 오버라이딩
		System.out.println(type + "번 방식으로 " + page + "페이지를 프린팅한다.");
	}

	public void setPage(int page) { // Printable 인터페이스 메서드의 오버라이딩
		this.page = page;
	}

	public boolean isAvailable() { // Printable 인터페이스 메서드의 오버라이딩
		if (color.equals("흰색"))
			return false;
		else
			return true;
	}
}

class Rectangle3 extends Shape3 {
	void draw() {
		System.out.println(color + " 사각형을 그리는 기능");
	}
}

class Triangle3 extends Shape3 {
	void draw() {
		System.out.println(color + " 삼각형을 그리는 기능");
	}
}

// ------------main 클래스--------------
public class InterfaceTest1 {
	public static void main(String args[]) {
		// 부모가 요구되는 자리에 자식이 올 수 있으므로
		// Printable한 클래스 객체인 Circle3() 클래스가 올 수 있다.
		printOut(new Circle3());
		
//		printOut(new Rectangle3()); // 컴파일 오류가 발생하는 행
	}
	
	static void printOut(Printable prt) {
		prt.setPage(100);
		
		((Shape3) prt).setColor("파란색");
		// setColor() 은 Printable 내 정의된게 아니므로
		// (Shape3) 강제 형변환(캐스팅)을 통해 접근하였다.
		
		if (prt.isAvailable())
			prt.print(Printable.PRINT_TYPE2);
	}
}
