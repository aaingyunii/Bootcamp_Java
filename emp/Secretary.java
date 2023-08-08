package emp;

public class Secretary extends Employee implements Bonus{
	// 기본 생성자
	public Secretary() {}
	// 매개변수를 받는 생성자
	public Secretary(String name, int number,
			String department,int salary)
	{
		super(name, number, department, salary);
	}
	
	// Employee 클래스 메서드 오버라이딩
	public double tax() {
		return super.getSalary() * 0.1;
	}
	// Bonus 인터페이스의 incentive 메서드 오버라이딩
	public void incentive(int pay) {
		super.setSalary(super.getSalary()+(int)(pay* 0.8));
	}
}
