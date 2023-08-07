package day5;

// 하나의 자바 소스안에 class는 하나인게 사실 좋으나
// 학습을 위해 한번에 확인하기 위해 이렇게 정의함.
// 또한, 하나의 자바 소스안에는 단 한개의 public class만 존재할 수 있다.
// public class는 자바 소스 파일명을 따라간다.
class Student{
	private String name;
	private int age;
	private String subject;
	
	// Student 생성자(constructor) 생성.
	// 객체 생성 시, 해당 파라미터 값들을 바로 입력받아
	// 해당 속성(변수)에 할당되어야 한다.
	Student(String name, int age, String subject){
		// 파라미터의 변수명과 클래스 객체의 속성(변수)명이 같으므로
		// 이를 구분하기 위해 this.을 붙인다.
		// this는 자기 자신의 객체를 참조한다는 것을 의미한다.
		this.name = name;
		
		if(age<0)
			this.age = -age;
		else
			this.age = age;
		this.subject = subject;
	}
	
	// 오버라이딩 
	Student(){
		// this -> 자기 객체를 참조할 때, 간략하게 쓸 수 있게 도와주는 것.
		// 파이썬의 self와 비슷하다.
		this("둘리",10,"자바");
	} // 객체 생성 시, 아무런 arguments가 없을 때 기본값.
	
	String getStudentInfo() {
		return name + "학생은 나이가 "+age+"세이고 "+subject+"과목을 학습합니다.";
	}
	
	void study() {
		System.out.println(name+"학생은 "+subject+"과목을 학습합니다.");
	}
}
public class StudentTest {
	public static void main(String[] args) {
//		Student st=new Student();
//		st.name="안인균";
//		st.age=26;
//		st.subject="Java";
		// 이전과 다르게 arguments 의 입력이 필수적이므로
		// 다음과 같이 선언할 수 있다.
		Student st = new Student("안인균",26,"Java");
//		st.name="안인균";
//		st.age=26;
//		st.subject="Java";
		// 또한 각 name, age, subject 변수가 Student class 에서
		// private으로 선언 되었기 때문에 해당 변수들은 다른 class에서 접근할 수 없다.
		// 따라서 위와 같이 직접 불러와 값을 할당할 수 없다.
		System.out.println(st.getStudentInfo());
		st.study();
		
		Student stuTest = new Student();
		System.out.println(stuTest.getStudentInfo());

		System.out.println("=====================");
		// st1, st2의 형식 Student class를 따르는 것을 표시해야하므로
		// 앞에 Student 를 붙여서 선언.
		Student st1 = st;
		Student st2 = st;
		// st1과 st2가 똑같이 st 참조 하겠다고 초기화되었으므로
		// 각각의 참조값이 다 똑같이 출력된다.
		System.out.println(st);
		System.out.println(st1);
		System.out.println(st2);
		
		System.out.println(st1.getStudentInfo());
		System.out.println(st2.getStudentInfo());
		// st에 입력된 값이 똑같이 출력된다.
				
	}
}
