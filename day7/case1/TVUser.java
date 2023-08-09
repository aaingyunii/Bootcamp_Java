package day7.case1;
public class TVUser {
	public static void main(String[] args) {
		SamsungTV tv = new SamsungTV();
//		LgTV tv = new LgTV();
		tv.powerOn();
		tv.volumnUp();
		tv.volumnDown();
		tv.powerOff();
	}
}
