package practiceExample.practice9;

class Book{
	String title;
	String author;
	int price;
	
	// argument 없을 시 default 값 전달하는 생성자.
	Book(){
//		this.title = "혼자공부하는자바";
//		this.author = "신용권";
//		this.price = 21600;
		this("혼자공부하는자바","신용권",21600);
	}
	
	Book(String title, String author, int price){
		this.title = title;
		this.author = author;
		
		if(price<0)
			this.price = -price;
		else
			this.price = price;
	}
	
	String getBookInfo() {
//		return "책 제목: "+title+" / 저자: "+author+" / 가격: "+price+"원";
		return title+" / "+author+" / "+price;
	}
}
public class BookTest {
	public static void main(String[] args) {
		Book bk = new Book();
		System.out.println(bk.getBookInfo());

		Book b1 = new Book("바다가 들리는 편의점","마치다 소노코",14400);
		System.out.println(b1.getBookInfo());
		
		Book b2 = new Book("비가 오면 열리는 상점","유영광",15120);
		System.out.println(b2.getBookInfo());
		
		Book b3 = new Book("세이노의 가르침","세이노",6480);
		System.out.println(b3.getBookInfo());
		
		Book b4 = new Book("진짜 챗GPT 활용법","김준성",16200);
		System.out.println(b4.getBookInfo());
		System.out.println("===============\n배열에 담아서 출력:");
		
		// 위에서 선언된 5개의 객체를 배열에 저장하는 과정.
		Book ary[] = new Book[5]; // 객체 배열
		ary[0] = bk;
		ary[1] = b1;
		ary[2] = b2;
		ary[3] = b3;
		ary[4] = b4;
		
		System.out.println(ary);
		for(int i =0;i<ary.length;i++)
			System.out.println(ary[i].getBookInfo());
		System.out.println("----------------");
		Book ary2[] = {bk,b1,b2,b3,b4};
		
		for(Book obj : ary2)
			System.out.println(obj.getBookInfo());
	}
}
