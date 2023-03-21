package day17;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamEx03 {

	public static void main(String[] args) {
		// ArrayList<Student> list 생성 후
		//list.add() 학생명,점수 추가
		
		//list로 스트림 생성 후
		//학생의 이름과 점수를 출력
		//점수 합계 출력

		ArrayList<Student> list = new ArrayList<>();
		
		list.add(new Student("정은",100));
		list.add(new Student("희은",90));
		list.add(new Student("다래",80));
		list.add(new Student("동글",70));
		list.add(new Student("방글",60));
		
		//이름:점수 출력
		//1.toString이 있는 경우
		Stream<Student> s = list.stream();
		s.forEach(n->System.out.println(n));
		
		//2.toString이 없는 경우
		//{} : 처리구문이 많은 경우 
		list.stream().forEach(h->{
			String name = h.getName();
			int score = h.getScore();
			System.out.println(name+": "+score);
		});
		
		
		//총 합계
		//getScore() => Integer => int 변환
		//추출 -> map, 추출 후 int 변환 => mapToInt
		int sum = list.stream().mapToInt(b->b.getScore()).sum();
		System.out.println("총 합계: " + sum);
		
		
		//총 인원
		System.out.println("총 인원: " + list.stream().count());
		
		
		//점수가 70점 이상인 친구들의 합계
		System.out.println("--점수가 70점 이상인 친구들--");
		list.stream().filter(n->n.getScore()>=70).forEach(System.out::println);
		System.out.println("= 70점 이상인 친구들의 합계");
		int sum1 = list.stream().mapToInt(h->h.getScore()).filter(n->n>=70).sum();
		System.out.println(sum1);
		
	}

}
