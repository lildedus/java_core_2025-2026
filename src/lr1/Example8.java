package lr1;
import java.util.Scanner;
public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Какой сегодня день недели? ");
        String day = in.nextLine();
        System.out.println("Какой сейчас месяц? ");
        String month = in.nextLine();
        System.out.println("Какое сегодня число? ");
        int date = in.nextInt();
        System.out.printf("%s %d %s \n", day, date, month);
        in.close();
    }
}
