package practiceExample;

public class ForLab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = (int)(Math.random()*10)+1;
		int y = (int)(Math.random()*11)+30;
		int result=0;

		
		for(int i=x;i<=y;i++) {
			if(i%2==0)
				result+=i;
		}
		System.out.println(x+" 부터 "+y+" 까지의 짝수의 합 : "+result);
	
	}

}
