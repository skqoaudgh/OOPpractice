
public class StringCalculator {
	
	// 문자열을 토근을 기준으로 나누어 String 배열에 담아 반환하는 메소드
	public String[] split(String string) {
		if(string == null) {
			return new String[] {};
		}
		return string.split(",|\n");
	}

	public int[] toInt(String[] values) {
		if(values == null) {
			return new int[] {};
		}
		int[] numbers = new int[values.length];
		for(int i=0; i<values.length; i++) {
			numbers[i] = Integer.parseInt(values[i]);
		}
		return numbers;
	}

}
