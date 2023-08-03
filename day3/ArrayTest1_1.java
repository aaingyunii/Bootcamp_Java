package day3;

public class ArrayTest1_1 {
	public static void main(String[] args) {
		int[] score = new int[5];
		System.out.println(score);
		System.out.println(score.length);
		
		for (int e : score)
			System.out.println(e);		
		/**
		 * "향상된 for문 ==> for each 문" - Java5 부터 지원.
		 * for(변수명 : 배열 or 컬렉션){
		 * 		배열의 길이만큼 반복적으로 실행
		 * }
		 * 
		 * ==> in Python
		 * for i in 배열 or 컬렉션
		 * 
		 * 이거와 같다.
		 */
		for(int i=0; i < score.length; i++)
            score[i] = (i+1)*100;
		
		for (int e : score)
			System.out.println(e);
	}
}
