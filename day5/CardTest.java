package day5;

class Card{	
	String kind ;		// 카드의 무늬 - 인스턴스 변수
	int number;		// 카드의 숫자 - 인스턴스 변수
	static int width = 100;	// 카드의 폭   - 클래스 변수
	static int height = 250;	// 카드의 높이 - 클래스 변수
	
	// static 변수(클래스 변수)들은 클래스 이름으로 접근이 가능하다.
	// ex) Card.width, Card.height
}

public class CardTest{
	public static void main(String args[]){	
		Card c1 = new Card();		
		c1.kind = "Heart";
		c1.number = 7;	
		
		Card c2 = new Card();		
		c2.kind = "Spade";
		c2.number = 4;	
		
		System.out.println("c1은 " + c1.kind + ", " + c1.number 
				+ "이며, 크기는 (" + Card.width + ", " + Card.height + ")");
		System.out.println("c2는 " + c2.kind + ", " + c2.number
				+ "이며, 크기는 (" + Card.width + ", " + Card.height + ")");	
		
		// 클래스 변수인 width와 height는 클래스의 "공유 변수"이므로
		// 어느 클래스 객체가 값을 변경해도 다른 클래스 객체에도 영향을 미친다.
		Card.width = 50;
		Card.height = 80;
		System.out.println("c1은 " + c1.kind + ", " + c1.number 
				+ "이며, 크기는 (" + Card.width + ", " + Card.height + ")" );
		System.out.println("c2는 " + c2.kind + ", " + c2.number 
				+ "이며, 크기는 (" + Card.width + ", " + Card.height + ")" );
	}
}




