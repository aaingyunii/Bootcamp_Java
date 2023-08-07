package practiceExample.practice9;

import java.util.Scanner;

class SalaryExpr{
	int bonus;
	
	SalaryExpr(){
		this(0);
	}
	// 생성자 오버로딩.
	SalaryExpr(int bonus){
		this.bonus = bonus;
	}
	int getSalary(int grade){
		int result = bonus; // bonus가 계속 늘어나기 때문에
					// result에 값을 저장해 bonus는 변하지 않도록 한다.
		
		switch(grade) {
		case 1:
			return result+=100;
		case 2:
			return result+=90;
		case 3:
			return result +=80;
		default :
			return result +=70;
		}
	}
}

public class SalaryExam {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	SalaryExpr se = new SalaryExpr(100);
	int month;
	int grade;
	
	total : while(true) {
		System.out.print("이번 달 입력 :");
		month = sc.nextInt();
		
		if(month>12) {
			System.out.println("잘못된 입력입니다.");
			continue;
		}
		while(month<=12) {
			if(month%2==0) {
				System.out.print("\n등급 입력 :");
				grade = sc.nextInt();
				if(grade>4) {
					System.out.print("잘못된 등급입니다. 다시 등급을 입력하시오");
					continue;
				}else {
					System.out.printf("%d월 %d등급의 월급은 %d만원 입니다."
							,month,grade,se.getSalary(grade));
					sc.close();
					break total;
				}
			}else {
				System.out.println("보너스 달이 아닙니다.\n다시 입력 바람.");
				break;
			}
		}
	}
}
}
