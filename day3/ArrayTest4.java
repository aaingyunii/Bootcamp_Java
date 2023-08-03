package day3;

public class ArrayTest4 {

	public static void main(String[] args) {
		// 5개의 정수 데이터를 저장할 배열을 생성하여 nums 배열 변수에 저장한다.
		int[] nums = new int[10];
		
		// 각각의 엘리먼트로 1~45 사이의 난수를 꺼내서 저장한다.
		for(int i=0; i < nums.length; i++)
			nums[i] = (int)(Math.random()*45) + 1;
		
		for(int i=0; i < nums.length; i++)
			System.out.print(nums[i]+ " ");
		System.out.println();
		
		for(int data : nums)  // for each
			System.out.print(data+ " ");
		System.out.println();
		
		// 인덱스 마지막 엘리먼트부터 첫번째 엘리먼트 순으로 출력
		for(int i=nums.length-1; i>=0; i--)
			System.out.print(nums[i]+" ");
		// for each 문으로는 역순 출력이 불가능.
		// ==> 배열의 데이터를 꺼내는 용도로만 활용 가능.
		
		// nums 라는 배열 변수가 참조하는 배열에서  최대값을 추출하여 출력해 보자.
		int bigNum = nums[0]; // 인덱스 0부터 시작해 아래 비교 연산을 통해
		int minNum = nums[0]; // 값의 재할당, 업데이트 형식으로 Max, Min 값을 찾는다.
		for(int i=1; i < nums.length;i++) {
			if (bigNum < nums[i])
				bigNum = nums[i];
			if (minNum > nums[i])
				minNum = nums[i];
		}
		System.out.printf("\nnums라는 배열에서 제일 큰 값 : %d", bigNum);
		System.out.printf("\nnums라는 배열에서 제일 작은 값 : %d", minNum);
	}

}
