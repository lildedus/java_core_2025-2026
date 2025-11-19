package urfu_2025_2025;
import java.util.Scanner;
public class timus_2012 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int f = in.nextInt();
		double tasks = 12-f;
		if (0.75*tasks<=4.0) {
		System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		in.close();
	}

}
