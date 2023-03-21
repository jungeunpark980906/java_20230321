package word;

import java.io.IOException;

public interface Program {
	void addWord(); //단어추가
	void printWord(); //단어출력(추가된 모든 단어)
	void searchWord(); //단어검색
	void updateWord(); //단어수정
	void deleteWord(); //단어삭제
	void printFile() throws IOException; //파일로출력
}
