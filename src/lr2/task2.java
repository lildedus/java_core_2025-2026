package lr2;
import java.util.Scanner;
public class task2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Введите число: ");
		int number = in.nextInt();
		if ((number % 5 == 2) && (number % 7 == 1)) {
			System.out.printf("Число %d подходит", number);
		} else {
			System.out.printf("Число %d не подходит", number);
		}
		in.close();
	}

}
