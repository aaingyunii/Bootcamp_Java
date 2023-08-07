# Java OOP

- 자바는 완벽한 객체지향프로그래밍언어.
<br><br>

- 객체는 **속성**과 기능**으로 이루어짐.
    - <u>속성은 변수, 기능은 메서드로 정의</u>한다.
    - 자바에서 클래스(Class)를 정의할 때 객체의 속성은 변수, 기능은 메서드로 정의한다.

```java
// 클래스 객체의 생성과 사용 예시.

class Student{
	String name;
	String subject;
	int age;

	String getStudentInfo() {
		return name + "학생은 나이가 "+age+"세이고 "+subject+" 과목을 학습합니다.";
	}
}

public class ____{
	public static void main(String[] args) {
		Student st = new Student();
		// 객체를 다루기 위해 참조변수 선언과
		// 생성된 객체의 주소를 참조변수에 저장하는 과정.
		
		st.name = "Baby";
		st.subject = "Java";
		st.age = 20;
		// 객체의 속성(변수)에 값 할당

		System.out.println(st.getStudentInfo());
		// 객체의 기능(메서드) 활용
	}
}
```

## 생성자(constructor)

- 인스턴스가 생성될 때마다 호출되는 ‘인스턴스 초기화 메서드’
- 인스턴스 변수의 초기화 또는 인스턴스 생성시 수행할 작업에 사용
- **모든 클래스에는 반드시 하나 이상의 생성자가 있어야 한다.**

### 생성자의 조건
- 생성자의 이름은 클래스의 이름과 같아야 한다.
- 생성자는 리턴값이 없다. (하지만 void를 쓰지 않는다.)
- 또한 하나의 클래스에 여러 개의 생성자를 정의해야하는 경우에는 오버로딩의 규칙을 따라야한다.

> 기본 생성자(default constructor)
매개변수가 없는 생성자
클래스에 생성자가 하나도 없으면 컴파일러가 기본 생성자를 추가한다.
(생성자가 하나라도 있으면 컴파일러는 기본 생성자를 추가하지 않는다.)

<br><br>

- javac : 자바컴파일러 명령
    - javac 자바소스명.java ----> 소스 안에 정의된 클래스 개수만큼 xxx.class

- java : 자바인터프리터(JVM) 명령
    - java xxx
    1. 클래스로딩
    1. 검증
    1. main() 메서드를 호출
> JVM(Java Virtual Machine) : 자바프로그램의 실행환경, 인터프리터




































	



