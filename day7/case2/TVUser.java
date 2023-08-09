package day7.case2;

public class TVUser {
	public static void main(String[] args) {
		TV tv = new LgTV();
//		TV tv = new SamsungTV();
		tv.powerOn();
		tv.volumnUp();
		tv.volumnDown();
		tv.powerOff();
	}

}
