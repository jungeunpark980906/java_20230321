package day17;

import java.util.ArrayList;

public class Customar_travel {

	public static void main(String[] args) {
		ArrayList<Customar> list = new  ArrayList<>();
		list.add(new Customar("이순신",40));
		list.add(new Customar("신사임당",35));
		list.add(new Customar("이아들",10));
		
		//고객 명단
		System.out.println("--전체 비용 명단--");
		list.stream().forEach(n->{
			String name = n.getName();
			int age = n.getAge();
			int price = n.getPrice();
			System.out.println(name+"("+age+")"+"/ 비용: "+price);
		});
		//전체 비용 계산
		System.out.println("--전체 비용--");
		int sum = list.stream().mapToInt(h->h.getPrice()).sum();
		System.out.println("비용: "+sum);
		
		//20세 이상의 성인만 출력
		System.out.println("--20세 이상 성인 명단--");
		//바로.sort 사용시 여러 값이 들어간 Customar이므로 error발생!
		list.stream().filter(h->h.getAge()>=20).map(a->a.getName()).sorted().forEach(n->System.out.println(n));
		list.stream().filter(h->h.getAge()>=20).sorted().forEach(n->System.out.println(n));
		
		
		
		
		
		
		
	

	}

}
