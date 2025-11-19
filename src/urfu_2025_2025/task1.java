package urfu_2025_2025;
import java.util.Scanner;
public class task1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Введите число: ");
        int number = in.nextInt();
        
        if (number % 3 == 0) {
            System.out.println("Введенное число делится на 3 без остатка");
        } else {
            System.out.println("Введенное число не делится на 3 без остатка");
        }
        
        in.close();
    }
}