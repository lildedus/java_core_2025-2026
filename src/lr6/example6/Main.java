package lr6.example6;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите числа через пробел: ");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println("Введите число");
        int size = in.nextInt();
        String[] string = str.split(" ");
        int[] ints = new int[string.length];
        for (int i = 0; i < string.length; i++) {
            ints[i]=Integer.parseInt(string[i]);
        }
        int[] result = Task6.getNumbers(ints,size);
        System.out.println("Итоговый массив: "+ Arrays.toString(result));
        in.close();
    }
}
