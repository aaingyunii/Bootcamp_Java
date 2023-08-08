package emp;

public class Company {
	public static void main(String[] args) {
		Employee[] emp1 = {
				new Secretary("Duke",1,"secretary",800),
				new Sales("Tuxi",2,"sales",1200)
		};
		
		printEmployee(emp1, false);
		
	}
	
	public static void printEmployee(Employee[] emp, boolean isTax) {
		for(int i=0;i<emp.length;i++) {
			System.out.print(emp[i].getName()+"\t"+emp[i].getDepartment()+"\t"
					+emp[i].getSalary()+"\t");
			
			if(isTax)
				System.out.print(emp[i].tax());
			
			if(emp[i].getNumber()==2)
				System.out.print(emp[i].getExtraPay());
			System.out.println();
		}
	}
}
