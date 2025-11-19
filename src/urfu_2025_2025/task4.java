package urfu_2025_2025;
import java.util.Scanner;
public class task4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Введите число: ");
		int num = in.nextInt();
		if (num >= 5 && num <= 10) {
			System.out.printf("Число %d подходит", num);
		} else {
			System.out.printf("Число %d не подходит", num);
		}
		in.close();
	}

}
