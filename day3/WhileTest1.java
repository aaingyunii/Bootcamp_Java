package day3;

public class WhileTest1 {

	public static void main(String[] args) {
		int sumV=0;
		int num;
		int count=0;
		
		// sumV 초기화를 해줘야 조건식에 들어맞는다.
		while(sumV < 100) {// 언제 끝날 지 예측 불가.
			num = (int)(Math.random()*50)+1;
			sumV += num; // sumV = sumV + num
			System.out.println("num : "+num+", sumV : "+sumV);
			System.out.println("반복 횟수 : "+(++count)+"\n");
		}
	}
}
