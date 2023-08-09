package emp;

public class Company {
	public static void main(String[] args) {
		Employee[] emp = {
				new Secretary("Duke",1,"secretary",800),
				new Sales("Tuxi",2,"sales",1200)
		};
		System.out.println("name\tdepartment\tsalary\t\textra pay");
		System.out.println("--------------------------------------------------------");
		printEmployee(emp, false);
		
		((Bonus) emp[0]).incentive(100);
		((Bonus) emp[1]).incentive(100);
		
		System.out.println("\n[인센티브 100 지급]");
		System.out.println("name\tdepartment\tsalary\ttax\textra pay");
		System.out.println("--------------------------------------------------------");
		printEmployee(emp, true);

	}
	
	public static void printEmployee(Employee[] emp, boolean isTax) {
		for(int i=0;i<emp.length;i++) {
			/**
			 * 출력문에서 부서이름 글자 수 차이에 의해 tap 간격이 서로 다르기 때문에
			 * 딱 맞게 떨어지게 하기 위해 if문을 통해 
			 * Sales와 Secretary 출력문 간격을 맞춤.(\t\t , \t)
			*/
			if(emp[i].getNumber()==2) 
				System.out.print(emp[i].getName()+"\t"+emp[i].getDepartment()+"\t\t"
						+emp[i].getSalary()+"\t");
			else
				System.out.print(emp[i].getName()+"\t"+emp[i].getDepartment()+"\t"
						+emp[i].getSalary()+"\t");
			
			// 세금 출력 여부
			if(isTax)
				System.out.print(emp[i].tax());
			
			// Sales에만 존재하는 getExtraPay() 메서드 호출
			// 여기서 Employee 클래스에는 존재하지 않기 때문에
			// Sales 캐스팅을 통해 해당 메서드에 접근 및 호출.
			if(emp[i].getNumber()==2) 
			// intanceof 연산자를 통해서도 Sales 객체를 찾을 수 있다.
				System.out.print("\t"+((Sales)emp[i]).getExtraPay());

			System.out.println();
		}
	}
}
