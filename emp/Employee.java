package emp;

public abstract class Employee {
	private String name;
	private int number; // 사원 번호
	private String department; // 부서
	private int salary; // 월급
	
	// 기본 생성자
	public Employee(){}
	// 매개변수를 받는 생성자
	public Employee(String name, int number,
			String department, int salary)
	{
		this.name = name;
		this.number = number;
		this.department = department;
		this.setSalary(salary);
	}
	
    // 세금 계산을 위한 추상 메서드
	public abstract double tax();
	
	/**
	 * 각 멤버변수들이 private으로 정의되어 있어
	 * 자식 클래스, main() 메서드에서
	 * 각 변수에 접근하기 위해 getter,
	 * 할당하기 위해 setter를 정의.
	 */
	// 이름 getter
	public String getName() {
		return name;
	}
	// 사원 번호 getter
	public int getNumber() {
		return number;
	}
	// 부서 getter
	public String getDepartment() {
		return department;
	}
	// 월급 getter
	public int getSalary() {
		return salary;
	}
	
	// 월급 setter
	public void setSalary(int salary) {
		this.salary = salary;

	}
}