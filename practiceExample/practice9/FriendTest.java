package practiceExample.practice9;

class Person {
	private String name;
	
	Person(String name) {
		this.name = name;
	}
	public String getInfo() {
		return name;
	}
}
class Friend extends Person{
	private String phoneNum;
	private String email;
	
	Friend(String name, String num, String email){
		super(name);
		this.phoneNum = num;
		this.email = email;
	}
	public String getInfo() { // 오버 라이딩
		return super.getInfo()+"\t"+phoneNum+"\t"+email;
	}
}

public class FriendTest {
	public static void main(String[] args) {
		Friend fr[] = new Friend[5];
		String[] names = {"대한","민국","만세","박수","짝짝짝"};
		String[] nums = {"010-1234-5678","010-9545-6212",
				"010-5464-7000","010-0000-0000","010-7787-9512"};
		String[] emails = {"ok22u@naver.com","qe452ot@naver.com"
				,"_pwee8@gmail.com","oivq62@gmail.com","wqeo767@hanmail.net"};
		
		for(int i=0;i<fr.length;i++) 
			// fr[i] 또한 하나의 클래스 객체이므로
			// 데이터 대입 시 클래스 객체 생성과 같이 접근해야함.
			fr[i] = new Friend(names[i],nums[i],emails[i]);
		
		
		System.out.print("이름\t전화번호\t\t메일주소\n");
		System.out.print("---------------------------------------------\n");
		for(Friend obj:fr)
			System.out.println(obj.getInfo());
	}
}
