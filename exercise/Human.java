package exercise;

class Human { // 같은 패키지에서 쓰기 때문에 public이 없어도 된다.
	private String name;
	private int age;
	private int height;
	private int weight;
	
	public Human(){
	}
	public Human(String name, int age, int height, int weight){
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	public String printInformation() {
		return name +"\t"+age+"\t "+height+"\t"+weight+"\t";
	}
	
}
