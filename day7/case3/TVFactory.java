package day7.case3;

public class TVFactory {
	// 해당 메서드의 반환 값이 TV object 형
	public static TV getTV(String beanName){
		TV obj = null;
		
		if(beanName.equals("samsung")){
			obj = new SamsungTV();
		} 
		else if(beanName.equals("lg")){
			obj = new LgTV();
		}
		return obj;
	}

}
