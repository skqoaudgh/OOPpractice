/*
 * 줄여쓰지 않는다.
 * 메소드의 이름, 변수의 이름 등 이름을 줄여 쓰는 것은 보는 이로 하여금 오해를 불러일으킬 수 있다.
 * 약속되고 보기쉬운 네이밍은 디버깅을 조금 더 수월하게 만들어 준다.
 * 
 * isTrue, Start 등
 */
public class NoAbbreviation {
	// 개선 전
	int GUI() {
		// GetUserInformation? GraphicUserInterface?
	}
	
	// 개선 후
	int GetUserInformation() {
		// 유저의 정보를 반환한다.
	}
	
	//-----
	public class Game {
		void Start() {
			// 게임을 시작하는 메소드
		}
	}
	Game game = new Game();
	game.Start(); // 메소드 이름을 GameStart라고 하는 것은 객체 이름 'game' 과의 중복이 있으므로 Start 라고 하는 것이 더 좋다.
	
}
