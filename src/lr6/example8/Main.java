package lr6.example8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите числа через пробел:");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] string = str.split(" ");
        int[] arrayInts = new int[string.length];
        for (int i = 0; i < string.length; i++) {
            arrayInts[i] = Integer.parseInt(string[i]);
        }
        double result = Task8.average(arrayInts);
        System.out.println("Среднее значение введенных чисел: "+result);
        in.close();
    }
}
