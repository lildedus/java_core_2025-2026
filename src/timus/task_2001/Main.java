package timus.task_2001;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt(); int b = in.nextInt();
		int a1 = in.nextInt(); int b1 = in.nextInt();
		int a2 = in.nextInt(); int b2 = in.nextInt();
		int x = a - a2;
		int y = b - b1;
		System.out.println(x +" "+ y);
		in.close();
	}

}
