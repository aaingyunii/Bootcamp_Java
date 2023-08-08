package day6;

class A{
	A(){
		System.out.println("A 클래스 객체 생성");
	}
}

class B extends A{
	B(){
		System.out.println("B 클래스 객체 생성");
	}
}

class C extends B{
	C(){
		System.out.println("C 클래스 객체 생성");
	}
}
// C > B > A > Object class

public class ABCTest {
	public static void main(String[] args) {
		new C(); 
		// C class의 생성자 메서드를 불러옴.
		// C가 처음 생성되면서 차례로 상속된 B(A를 상속), A class 가 호출된다.
		// 상속이 많을수록 메모리 할당 부담이 커진다. <- 많은 부모 객체들도 생성되므로
		// 처리되는 순서 또한 부모 클래스 부터 처리된다.
		// (부모 클래스 로딩이 먼저되어야한다는 규칙이 있다.)
	}
}
