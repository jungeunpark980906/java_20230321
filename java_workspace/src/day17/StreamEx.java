package day17;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamEx {

	public static void main(String[] args) {
		/* 문자열(이름)을 담는 리스트 생성 후, 스트림으로 생성
		 * 정렬하여 출력
		 * */
		ArrayList <String> list = new ArrayList<>();
		list.add("정은");
		list.add("희은");
		list.add("다래");
		list.add("동글");
		list.add("방글");
		list.add("다람쥐배가통통");
		list.add("고양이옹동이가부들");
		
		
		Stream<String> s = list.stream();
		s.sorted().forEach(System.out::println);
		//s.sorted().forEach(n->System.out.println(n));
		//stream은 한번쓰면 소모되어서 두번 출력이x
		
		//글자수가 5글자 이상인 이름만 출력
		System.out.println("--글자수가 5이상--");
		list.stream().filter(n->n.length()>=5)
			.sorted().forEach(System.out::println);	
		
		//각각 이름의 글자 수를 출력
		System.out.println("--각 이름의 글자 수--");
		list.stream().map(n->n.length()).forEach(System.out::println);

		
		
	}

}
