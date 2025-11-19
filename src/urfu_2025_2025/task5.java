package urfu_2025_2025;
import java.util.Scanner;
public class task5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Введите число: ");
		int num = in.nextInt();
		int x = num / 1000;
		if (((x > 20) && ((x % 10)<=4) || (x <= 4))) {
		System.out.printf("В числе %d %d тысяча", num, x);
		} else {
			System.out.printf("В числе %d %d тысяч", num, x);
		}
		
		
		in.close();
	}

}
