package urfu_2025_2025;
import java.util.Scanner;
public class timus_1264 {

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
