/*
 * 한 줄에 한 점만 사용한다.
 * 한 줄에 여러 개의 점이 사용된다면 하나의 동작이 아니라 여러 동작이 일어나고 있다는 뜻이다.
 * 객체의 데이터를 메소드가 아니라 점으로 호출한다거나 하는 등은 캡슐화가 잘못되어 있는 것이다.
 */
public class OneDotperLine {
	// 개선 전
	int getUsersFamilyName_before() {
		StringBuffer buf = new StringBuffer();
		for(Node next: users) {
			buf.append(next.user.name.subString(0,1));
		}
	}
	
	// 개선 후
	int getUsersFamilyName_after() {
		StringBuffer buf = new StringBuffer();
		for(Node next: users) {
			next.printFamilyName(buf);
		}
	}
	void printFamilyName(StringBuffer buf) {
		current.printFamilyName(buf);
	}
	
	class User {
		void printFamilyName(StringBuffer buf) {
			buf.append(getFamilyName());
		}
	}
}
