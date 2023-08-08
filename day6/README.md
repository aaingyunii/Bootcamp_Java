## Java 제어자
- 클래스, 변수, 메서드, 생성자 등에 추가로 설정하여 대상의 사용방법, 메모리 할당 시기 또는 스코프 등을 결정하는 역할

1. 접근제어자 : public '+', protected '#', () 'default', private '-' / '?'-> 클래스 다이어그램 내 표시 기호
   - 클래스 앞 : `public` or `()`(생략) 둘 중 하나만 가능.
   - 멤버변수, 생성자, 메서드 앞 : `public`, `protected`, `(생략)`, `private`

2. 활용제어자(일반제어자) : static, final, abstract
   - `static` : 멤버변수, 메서드, static 블럭
   - `final` : 클래스, 멤버변수, 지역변수, 메서드
   - `abstract` : 클래스, 메서드

## 상속
```java
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

```

 ## ➕ `new` 연산자 🚀
- 객체를 Heap이라는 메모리 영역에 메모리 공간을 할당해주고 메모리주소를 반환한 후 생성자를 실행시켜준다.
- `new` 연산자로 생성된 객체는 똑같은 값이라도 **서로 다른 메모리를 할당**하기 때문에 **서로 다른 객체로 분리**된다.
- ### `String str = new String("string");` 작동원리 예시
> 우선 변수는 'Stack' 영역에 할당되고, `new String` 으로 생성된 문자열값이 'Heap' 영역의 메모리 공간을 할당받아<br>
> `str` 이라는 변수가 그 메모리주소를 가르킬 것 입니다. 이를 다른 말로 **참조** 라고도 합니다.<br><br>
> 만약 `String str2 = new String("string");` 와 같은 똑같은 값을 가진 변수가 선언되어 `new` 연산자를 통해 초기화 된다면<br>
> 이는 **똑같이 'Stack' 과 'Heap' 영역의 메모리 공간을 할당받아 저장**될 것 이며, **앞서 선언한 `str` 과는 전혀 다른 변수**임이 나타날 것 입니다.











