package day7;

import java.util.HashSet;
import java.util.Iterator;

public class SetExample1 {
	public static void main(String args[]) {
		HashSet<String> set = new HashSet<String>();
		System.out.println(set.add("자바")); // 반환값은 boolean, 
										// 들어가면 true, 안들어가면 false
		System.out.println(set.add("카푸치노"));
		System.out.println(set.add("에스프레소"));
		System.out.println(set.add("자바")); // 자동으로 데이터가 set에 이미 존재하는 지 체크
											
		System.out.println("저장된 데이터의 수 = " + set.size());

		for (String s : set)
			System.out.print(s+"\t");
		System.out.println("\n");
		
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String str = iterator.next();
			System.out.println(str);
		}
		System.out.println(set);
	}
}
