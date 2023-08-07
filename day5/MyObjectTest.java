package day5;

class MyObject { // extends Object{
	// 생성자를 구현하지 않아도 객체 생성이 되면
	// 명시적으로 구현되지 않을 뿐 자동으로 default 생성자가 생성된다. 
}	

class MyObject2{
	// 부모 클래스의 toString() 메서드를 오버라이딩한 것.
	public String toString() {
		return "MyObject2 클래스의 객체 입니다~~~!";
	}
}

class MyObject3{
	public String toString() {
		// 여기서 원하는 것은 부모 클래스에서 정의된 toString()을 불러와서
		// 같이 출력하고 싶은 것.
		// 따라서 super. 구문을 통해 부모 클래스를 지정해서 해당 구문을 완성.
		return super.toString()+"\t// MyObject3 클래스의 객체 입니다~~~!";
		
		// this. -> 자기 자신
		// super. -> 부모 클래스
	}
}
public class MyObjectTest {
	public static void main(String[] args) {
		MyObject obj = new MyObject();
		System.out.println(obj.toString());
		System.out.println(obj);
		
		java.util.Date d = new java.util.Date();
		System.out.println(d);
		
		MyObject2 obj2 = new MyObject2();
		System.out.println(obj2);
		
		MyObject3 obj3 = new MyObject3();
		System.out.println(obj3);
	}
}
