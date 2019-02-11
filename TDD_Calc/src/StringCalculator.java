
public class StringCalculator {
	
	// 문자열을 토근을 기준으로 나누어 String 배열에 담아 반환하는 메소드
	public String[] split(String string) {
		if(string == null) {
			return new String[] {};
		}
		return string.split(",|\n");
	}

}
