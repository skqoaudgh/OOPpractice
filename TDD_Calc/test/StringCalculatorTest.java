import org.junit.Assert;

import junit.framework.TestCase;

public class StringCalculatorTest extends TestCase {
	
	StringCalculator cal = new StringCalculator();

	public void testSplit() throws Exception {
		// 다양한 입력값에 대한 테스트를 수행한다.
		String[] result = cal.split("1");
		Assert.assertArrayEquals(new String[] {"1"}, result);
		
		result = cal.split("");
		Assert.assertArrayEquals(new String[] {""}, result);		
		
		// null 포인트를 split에 전달하면 널포인트 예외가 뜨기 때문에 이에 대한 처리가 필요하다.
		result = cal.split(null);
		Assert.assertArrayEquals(new String[] {}, result);			
	}
	public void testSplitWithComma() throws Exception {
		String[] result = cal.split("1,2,3");
		Assert.assertArrayEquals(new String[] {"1","2","3"}, result);
	}
	public void testSplitWithNewLine() throws Exception {
		String[] result = cal.split("1\n2\n3");
		Assert.assertArrayEquals(new String[] {"1","2","3"}, result);
	}
	public void testSplitWithNewLineAndComma() throws Exception {
		String[] result = cal.split("1,2\n3");
		Assert.assertArrayEquals(new String[] {"1","2","3"}, result);
	}
	
	public void testToInt() throws Exception {
		int[] result = cal.toInt(new String[] {"1","2"});
		Assert.assertArrayEquals(new int[] {1,2}, result);
		
		result = cal.toInt(new String[] {});
		Assert.assertArrayEquals(new int[] {}, result);
		
		result = cal.toInt(null);
		Assert.assertArrayEquals(new int[] {}, result);		
	}
}
