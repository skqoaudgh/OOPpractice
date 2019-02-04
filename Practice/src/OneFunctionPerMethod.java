/*
 * 메소드당 들여쓰기 한 번 - 메소드는 한가지 일만 하는 것이 보기 좋다.
 * 중첩된 제어구문(if문 등)이 있다면 이 메소드는 한 가지 이상의 일을 하고 있는 것이다.
 * 이는 객체지향설계의 기본으로 볼 수 있다.
 * 
 * 코드에서 버그 판별이 쉬워진다.
 * 재사용이 쉬워진다.
 * 메소드의 응집력이 높아진다.
 */
public class OneFunctionPerMethod {
	int[][] array = new int[10][10];

	void addDataToArray(int w, int h) {
		// array에 정수형 데이터를 입력한다. 작성되어 있다고 가정
	}

	/* 개선 전
	 * 2중 반복문을 통해 array에 저장된 데이터들을 출력하는 메소드.
	 * 들여쓰기가 2번 되어 있어 보기 불편하고 하나의 기능을 한다고 할 수 없다.
	 */
	String printBoard_before() {
		StringBuffer buf = new StringBuffer();
		for(int i=0; i<10; i++)
			for(int j=0; j<10; j++)
				buf.append(array[i][j]);
			buf.append('\n');
		return buf.toString();
	}
	
	/* 개선 후
	 * 배열의 하나의 행을 출력하는 메소드, 배열의 모든 행을 취합하는 메소드, 취합된 행들을 출력하는 메소드로 총 3개의 메소드 작성
	 * 각 메소드들은 들여쓰기가 최소로 되어 있고, 하나의 기능을 하고 있다고 볼 수 있다. 
	 */
	String printBoard_after() {
		StringBuffer buf = new StringBuffer();
		printRows(buf);
		return buf.toString();
	}
	
	void printRows(StringBuffer buf) {
		for(int i=0; i<10; i++)
			printRow(buf,i);
	}
	
	void printRow(StringBuffer buf, int row) {
		for(int i=0; i<10; i++) 
			buf.append(array[row][i]);
		buf.append('\n');
	}
}