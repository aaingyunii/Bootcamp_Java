package emp;

public class Sales extends Employee implements Bonus{
	// 기본 생성자
	public Sales() {}
	// 매개변수를 받는 생성자
	public Sales(String name, int number,
			String department,int salary)
	{
		super(name, number, department, salary);
	}
	
	// Employee 클래스 메서드 오버라이딩
	public double tax() {
		return super.getSalary() * 0.13;
	}
	
	// Bonus 인터페이스의 incentive 메서드 오버라이딩
	public void incentive(int pay) {
		super.setSalary(super.getSalary()+(int)(pay* 1.2));
	}
	
	// 추가 수당 지급을 위한 메서드, 오직 Sales 클래스에만 존재
	public double getExtraPay() { 
		return super.getSalary()*0.03;
	}
}
