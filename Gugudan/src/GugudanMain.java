import java.util.Scanner;

public class GugudanMain {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String[] inputs = input.split(",");
		
		int first = Integer.parseInt(inputs[0]);
		int second = Integer.parseInt(inputs[1]);
		
		int[][] result = new int[first-1][second];
		Gugudan.calculate(result,first,second);
		Gugudan.print(result);
	}
}
