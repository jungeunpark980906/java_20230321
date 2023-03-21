package day17;

public class Student {
	//name, score
	//생성자, getter/setter
	private String name;
	private int score;
	
	//생성자
	public Student() {}
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	
	
	//getter,setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return  name + " : " + score;
	}
	
	
	
	

}
