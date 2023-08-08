package exercise;

class Student extends Human { // 같은 패키지에서 쓰기 때문에 public이 없어도 된다.
	private String number;
	private String major;
	
	public Student(){
	}
	public Student(String name, int age, int height
			,int weight, String number, String major)
	{
		super(name,age,height,weight);
		this.number=number;
		this.major = major;
	}
	public String printInformation() {
		return super.printInformation()+number+"\t"+major;
	}
	
}
