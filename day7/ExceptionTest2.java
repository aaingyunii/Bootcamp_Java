package day7;
public class ExceptionTest2 {
	public static void main(String[] args){
		System.out.println("수행시작");
		try {
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			int result = num1/num2;
			System.out.println("연산 결과 : "+result);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("프로그램 아규먼트를 2 개 전달하세요!!");
			
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("두번째 프로그램 아규먼트는 0이 아닌 값을 전달하세요!!");
			return; // return이 있어도 finally 구문은 실행된다.
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
			System.out.println("프로그램 아규먼트로 숫자를 전달하세요!!");
		
		} catch (Exception e) { // 뒤 catch 구문의 예외 클래스들의 가장 상위 클래스를
				// 여기서 구현하여 한번에 처리가 가능하다.
			 	System.out.println("뭔진 몰라도 예외 발생!");
			 	}
		// 부모 클래스일수록 아래에 정의하여 위의 특정 에러에 대한 처리를 해주고
		// 그 이외의 모르는 에러에 대한 처리를 진행한다.
		
		finally {
			System.out.println("항상 수행!!");
		}
		System.out.println("수행종료");
	}
}
