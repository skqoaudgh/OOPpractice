/*
 * 모든 엔티티를 작게 유지한다. 2개 이상의 인스턴스 변수를 가진 클래스를 사용하지 않는다.
 * 
 * 대략 50줄 이상인 클래스와 파일이 10개 이상인 패키지는 없어야 한다.
 * 너무 많은 엔티티는 응집력을 낮춘다. (응집력은 객체설계에 있어서 하나의 지표가 될 수 있다)
 * 
 * 또, 한 클래스가 여러 개의 인스턴스 변수를 가지는 것도 응집력을 낮춘다.
 * 따라서 하나의 클래스는 하나의 상태변수를 처리하도록 한다.
 */
public class MinimumEntity {
	/* 개선 전
	 * 하나의 Name 클래스가 성, 중간이름, 이름 모두를 다루고 있다.
	 */
	class Name  {
		String FirstName;
		String ModdleName;
		String LastName;
	}
	
	/* 개선 후
	 * 성만을 담당하는 클래스, 성 이외의 이름(중간이름, 이름)을 담당하는 클래스로 나누어 작성한다.
	 * GivenName은 두 종류의 이름을 다루기 때문에 인스턴스 변수 또한 배열(리스트)로 선언한다.
	 */
	class SurName {
		String FamilyName;
	}
	class GivenName {
		List<String> Names; 
	}
}
