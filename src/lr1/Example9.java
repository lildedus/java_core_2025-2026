package lr1;
import java.util.Scanner;
public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название месяца в предложном падеже: ");
        String month = in.nextLine();
        System.out.println("Введите кол-во дней в этом месяце: ");
        int days = in.nextInt();
        if (((days % 10) == 1) || days == 1) {
            System.out.printf("В %s %d день \n", month, days);
        }
        if ((days % 10) >= 5 || (days % 10 == 0)) {
            System.out.printf("В %s %d дней \n", month, days);
        }
        in.close();
    }
}
