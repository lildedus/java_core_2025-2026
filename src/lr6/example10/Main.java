package lr6.example10;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите числа через пробел:");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] string = str.split(" ");
        int[] x = new int[string.length];
        for (int i = 0; i < string.length; i++) {
            x[i] = Integer.parseInt(string[i]);
        }
        System.out.println(Arrays.toString(Task10.values(x)));
    }
}
