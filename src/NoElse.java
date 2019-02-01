/*
 * else를 사용하지 않는다.
 * 다중 조건문의 사용은 코드를 보기 불편하게 만든다. 이는 switch도 마찬가지이다.
 * 리팩토링에 수월하지 않고 여러 분기가 나뉘어져 코드 중복이 발생하기도 한다.
 * 
 * 명확하게 조건을 명시하여 디버깅을 수월하게 만든다.
 */
public class NoElse {
	// 개선 전
	void checkInput_before(int input) {
		if(input < 0) {
			doSomething();
		}
		else {
			doOtherThing();
		}
	}
	// 개선 후
	void checkInput_after(int input) {
		if(input < 0) {
			doSomething();
			return;
		}
		doOtherThing();
	}

	// 개선 전
	int getResult() {
		if(isSomeContidion()) {
			return 1;
		}
		else {
			return 2;
		}
	}
	
	// 개선 후
	int getResult() {
		return isSomeContidion() ? 1 : 2; // 6줄에서 1줄로 간결하게 작성이 가능하다!
	}
}
