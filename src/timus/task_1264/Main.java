package timus.task_1264;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int m = in.nextInt();
		int M = m + 1;
		int result = n*M;
		System.out.println(result);
		in.close();
	}

}
