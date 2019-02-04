/* Getter와 Setter를 남용하지 않는다.
 * 굳이 필요 없는 곳에 Getter와 Setter를 작성하여 사용하는 것은 비효율적이다.
 * 클래스 내부에서 동작하는 것에 Getter와 Setter를 굳이 사용할 필요는 없을 것이다.
 * 
 * Getter와 Setter는 MVC모델에서 객체의 위치를 표현해주거나, 하는 등 클래스 외부에서 필요한 경우에 사용한다.
 * 
 */
public class NoGetterSetter {
	/* 개선 전
	 * Move 함수에서 사용하기 위해 X,Y좌표에 대한 Getter와 Setter를 작성한다.
	 */
	class Point {
		int x,y;
		int getX() {
			return this.x;
		}
		int getY() {
			return this.y;
		}
		void setX(int x) {
			this.x = x;
		}
		void setY(int y) {
			this.y = y;
		}		
		void move(int dir) {
			switch(dir) {
				case 0: setX(getX()-1);
				// . . . . //
			}
		}
	}
	/* 개선 후
	 * Getter와 Setter는 불필요하므로 사용하지 않고 멤버변수를 직접 사용한다.
	 */
	int x,y;
	void move(int dir) {
		switch(dir) {
		case 0: this.x = this.x-1;
		// . . . . //
	}		
	}
}
