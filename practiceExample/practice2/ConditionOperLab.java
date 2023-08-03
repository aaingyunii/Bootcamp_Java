package practiceExample.practice2;

public class ConditionOperLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = (int)(Math.random()*5)+1;
		int x = 300;
		int y = 50;
		int result;
		
		if(a==1)
			result = x+y;
		else if(a==2)
			result = x-y;
		else if(a==3)
			result = x*y;
		else if(a==4)
			result = x/y;
		else
			result = x%y;
		System.out.println("출력된 숫자 : "+a);
		System.out.println("결과값 : "+result);
	}

}
