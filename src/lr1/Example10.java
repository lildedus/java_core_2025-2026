package lr1;
import java.util.Scanner;
public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите год вашего рождения: ");
        int year = in.nextInt();
        year = 2025 - year;
        if (((year > 20) && ((year % 10) <= 4)) || (year <= 4)) {
            System.out.printf("Вам %d года \n", year);
        } else {
            System.out.printf("Вам %d лет \n", year);
        }
        in.close();
    }
}
