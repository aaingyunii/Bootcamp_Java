package sample1;

public class MessageBeanImpl implements MessageBean{
	// MessageBeanImpl <-- 인터페이스명Impl
	// [인터페이스명]을 implements 하는 class 라는 것을 파일명으로 표시
	//==> MessageBean 인터페이스를 implements 한 class 다.
	
	private String fruit;
	private int cost;	
	public MessageBeanImpl() {
		super();
		System.out.println("MessageBeanImpl Default Constructor Call");
	}
	public MessageBeanImpl(String fruit) {
		super();
		this.fruit = fruit;
		System.out.println(fruit + " :  MessageBeanImpl 생성자 메서드 호출");
	}

	public void setCost(int cost) {
		this.cost = cost;
		System.out.println("setCost() 호출");
	}

	@Override
	public void sayHello() {      
		System.out.println(fruit + " : " + cost);
	}

	@Override                     
	public void sayHello(String fruit, int cost) {   
		System.out.println(fruit + " : " + cost);
	}
}






