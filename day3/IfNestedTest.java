package day3;

public class IfNestedTest {
	public static void main(String[] args) {
		int score = (int)(Math.random()*20) + 81; //81~100.
		System.out.println("점수: " + score);
		
		String grade;
		
		if(score>=90) {
			if(score>=95) {
				grade = "A+"; //abc : 변수명, abc() : 메서드, "abc": 문자열리터럴
			} else {
				grade = "A";
			}
		} else {	
			if(score>=85) {
				grade = "B+";
			} else {
				grade = "B";
			}
		}
		
		System.out.println("학점: " + grade);
	}
}