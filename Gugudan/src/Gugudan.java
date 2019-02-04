
public class Gugudan {

	public static void calculate(int[][] result, int times, int num) {	
		for(int i=0; i<times-1; i++) {
			int time = i+2;
			for(int j=0; j<num; j++) {
				result[i][j] = time*(j+1);
			}
		}
	}
	
	public static void print(int[][] result) {
		for(int i=0; i<result.length; i++) {
			for(int j=0; j<result[0].length; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println(" ");
		}
	}
}
