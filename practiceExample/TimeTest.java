package practiceExample;

public class TimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int time = 32150;
//		초 -> 분 -> 시 
		int sec;
		int min;
		int hour;
		hour =  time / 3600;
		min = (time / 60) % 60;
		sec = time % 60;
		
		System.out.println(hour+"시간 "+min+"분 "+sec+"초");
	}

}
