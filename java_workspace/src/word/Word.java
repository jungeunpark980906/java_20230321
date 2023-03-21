package word;

import java.util.Collections;
import java.util.Objects;

public class Word{
	private String word;
	private String mean;
	
	public Word() {}
	
	public Word(String word, String mean) {
		this.word = word;
		this.mean = mean;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getMean() {
		return mean;
	}

	public void setMean(String mean) {
		this.mean = mean;
	}

	@Override
	public String toString() {
		return word + ":" + mean;
	}
	
	
	
//아래사용시, public class Word implements Comparable{ 로 변경해서 사용
//	//source => hash/equals
//	@Override
//	public int hashCode() {
//		//hashCode : 객체의 주소값을 정수로 변환
//		return Objects.hash(mean, word);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Word other = (Word) obj;
//		if(word == null) {
//			if(other.word != null) {
//				return false;
//			}
//		} else if(!word.equals(other.word)) {
//			return false;
//		}
//		return true;
//	}
//
//	@Override
//	public int compareTo(Object o) {
//		Word word = (Word)o;
//		//오름차순
//		return this.word.compareTo(word.word);
//		//내림차순
//		//return -this.word.compareTo(word.word);
//	}
	
}
