/*
 * 원시값을 그대로 전달하지 않고 포장을 한다.
 * 매개변수로 원시값(int, float ..)을 사용한다면 이 매개변수의 의미를 알기 어렵다.
 * 그러므로 클래스 객체를 이용하여 전달해야 한다.
 * 
 * 코드 보기가 수월해진다.
 * 다양한 정보를 전달할 수 있다. (원시값으로 보낸다면 여러 매개변수를 사용해야 할 것이다)
 * 예외처리가 쉬워지고 코드의 반복을 줄여준다
 */
public class UseWrapper {
	// 개선 전
	int getUserType_before(double height, double weight, String blood) {
		int type = 0;
		// 입력받은 유저의 height, weight, blood를 가지고 타입을 반환하는 메소드.
		// 매개변수의 이름을 가지고 각 매개변수가 무엇을 의미하는지 파악하기 어렵다.
		// 또, 각 매개변수에 대한 예외처리와 데이터 검사를 하기 어렵다.
		return type;
	}	
	void someMethod_before() {
		int UserType = getUserType_before(177.7,70.5,"AB");
	}
	
	// 개선 후
	class User {
		private double height, weight;
		private String blood;
		//-----
		// 생성자
		User(double height, double weight, String blood) {
			this.height = height;
			this.weight = weight;
			this.blood = blood;
		}
		// Get 메소드
		double getUserHeight() {
			return this.height;
		}
		double getUserWeight() {
			return this.weight;
		}
		String getUserBloodType() {
			return this.blood;
		}
		// Set 메소드
		void setUserHeight(double height) {
			if(height < 100) return;
			this.height = height;
		}
		void setUserWeight(double weight) {
			if(weight < 30) return;
			this.weight = weight;
		}
		void setUserBloodType(String blood) {
			if(!blood.equals("AB") || !blood.equals("A") || !blood.equals("B") || !blood.equals("O")) return;
			this.blood = blood;
		}
	}
	int getUserType_after(User user) {
		int type = 0;
		// user 객체를 매개변수로 전달받아 필요한 작업을 수행한다.
		// User 클래스는 각 데이터를 입력 받을 때, 데이터의 검사를 진행하기 때문에 예외 발생 가능성이 적다.
		return type;
	}	
	void someMethod_after() {
		User user = new User(177.7,70.5,"AB");
		int UserType = getUserType_after(user);
	}	
}
