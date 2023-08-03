package day3;
public class PrintfTest {
	public static void main(String[] args) {
		System.out.printf("테스트입니당%n");	
		System.out.printf("테스트%d입니당\n",10);		
		System.out.printf("테스트입니당%n");
		System.out.printf("%d %x %o %c\n", 100, 100, 100, 100);
		
		// 1$ : 인수 인덱스 첫번째를 가리키므로, 100을 지정해서 포맷에 맞게 출력.
		System.out.printf("%d %1$x %1$o %1$c\n", 100);
		
		System.out.printf("%c %c %c %c\n", '가', 'A', '!', '3');
		System.out.printf("%b\n", true);
		System.out.printf("%f %e\n", 100.0, 100.0);
		System.out.printf("%.2f\n", 123.5678);
		System.out.printf("|%s|\n", "자바");
		System.out.printf("|%10s|\n", "자바");
		System.out.printf("|%-10s|\n", "자바");
		System.out.printf("%,d원\n", 1000000);	
/**
 * printf("%d",10) -> decimal 10진수
 * printf("%.2f",10) -> float, .2 : 소수점둘째자리까지 반올림해서 표시.
 * %s : 문자열 / %c : 문자 / %b : boolean / %x : 16진수 / %o : 8진수
 * 1$는 Java에서 포맷 문자열 내에서 인수 인덱스를 나타내는 것을 의미
 */
	}
}








