package lr5.example4;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        Task4 task4 = new Task4();
        System.out.println("Введите дробное число: ");

        double input = in.nextDouble();
        task4.setCode(input);

        System.out.println("Символ, соответствующий целой части введенного числа: "+task4.getaChar());
        System.out.println("Значения введенного числа после запятой (до сотых): "+task4.getAnInt());
        in.close();
    }
}
