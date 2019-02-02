/*
 * 일급 콜렉션을 사용한다.
 * 콜렉션을 다루는 클래스라면 콜렉현 하나만을 멤버 변수로 사용하도록 작성한다.
 * 이는 하나의 클래스가 콜렉션을 다루는 클래스라면, 하나의 콜렉션과 그것을 다루는 메소드들로 이루어지게 설계하는 것이다.
 * 
 * 설계자의 의도에 따라 메소드들을 사용하도록 할 수 있다.
 * 콜렉션의 객체화, 캡슐화
 */

import java.util.ArrayList;

public class PrimeColletion {
	/* 개선 전
	 * 하나의 클래스가 두 개의 콜렉션(games, types)를 다루고 있다. 
	 * 이는 클래스의 응집력을 떨어뜨리는 일이다.
	 */
	class Game_before {
		ArrayList<Integer> games = new ArrayList<Integer>();
		ArrayList<Integer> types = new ArrayList<Integer>();
		// . . . . //
		
		int getGame(int num) {
			return games.get(num);
		}
		int getType(int num) {
			return types.get(num);
		}		
		// . . . . //
	}
	
	/* 개선 후
	 * games와 types를 두 개의 클래스로 나누어 작성한다.
	 */
	class Game_after {
		ArrayList<Integer> games = new ArrayList<Integer>();
		
		int getGame(int num) {
			return games.get(num);
		}	
	}
	
	class GameType_after {
		ArrayList<Integer> types = new ArrayList<Integer>();
		
		int getType(int num) {
			return types.get(num);
		}		
	}
}
