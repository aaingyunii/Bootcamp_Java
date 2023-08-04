package day4;

// 하나의 자바 소스안에 class는 하나인게 사실 좋으나
// 학습을 위해 한번에 확인하기 위해 이렇게 정의함.
// 또한, 하나의 자바 소스안에는 단 한개의 public class만 존재할 수 있다.
// public class는 자바 소스 파일명을 따라간다.
class Student{
	String name;
	int age;
	String subject;
	
	String getStudentInfo() {
		return name + "학생은 나이가 "+age+"세이고 "+subject+" 과목을 학습합니다.";
	}
}
public class StudentTest {
	public static void main(String[] args) {
		Student st=new Student();
		st.name="안인균";
		st.age=26;
		st.subject="Java";
		System.out.println(st.getStudentInfo());

		System.out.println(st);
// day4.Student@5aaa6d82 -> "패키지명"."객체가참조한클래스명"@참조값(메모리주소, 16진수)

		Student st1=new Student();
		st1.name="둘리";
		st1.age=10;
		st1.subject="Python";
		System.out.println(st1.getStudentInfo());
		// 객체는 필요한 만큼 생성이 가능하다.
		
		Student st2=new Student();
		st2.name="또치";
		st2.age=11;
		st2.subject="HTML";
		System.out.println(st2.getStudentInfo());
		
		Student st3=new Student();
		st3.name="도우너";
		st3.age=10;
		st3.subject="CSS";
		System.out.println(st3.getStudentInfo());
		
	}
}
