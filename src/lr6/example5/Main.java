package lr6.example5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите числа от одного до n через пробел:");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] string = str.split(" ");
        double[] numbers = new double[string.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Double.parseDouble(string[i]);
        }
        double n = Double.parseDouble(string[string.length-1]);
        n = (n*(n+1)*(2*n + 1))/6.0;
        System.out.println("Сумма квадратов введенных чисел: "+Task5.getNumbers(numbers));
        System.out.println("Проверка: "+n);
        in.close();
    }
}
