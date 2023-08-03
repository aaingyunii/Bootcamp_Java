package practiceExample.practice3;

public class SwitchLab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = (int)(Math.random()*5)+1;
		int x = 300;
		int y = 50;
		int result;
		
		
		switch(a) {
		case 1:
			result=x+y;
			break;
		case 2:
			result = x-y;
			break;
		case 3:
			result = x*y;
			break;
		case 4:
			result = x/y;
			break;
		default:
			result = x%y;
			break;
		}
		System.out.println("출력된 숫자 : "+a);
		System.out.println("결과값 : "+result);
	}

}
