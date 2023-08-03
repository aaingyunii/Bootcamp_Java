package day3;

public class ArrayTest1 {
	public static void main(String[] args) {
		int[] score = new int[5];
		
		System.out.println(score); // 비어있는 배열, 객체의 메모리 주소값 출력
								// [I@참조값(16진수)
		System.out.println(score.length);
		
		for (int i=0; i < score.length; i++)
			System.out.println(score[i]);
		
		for(int i=0; i < score.length; i++)
            score[i] = (i+1)*100;
		
		for (int i=0; i < score.length; i++)
			System.out.println(score[i]);
	}
}
