package lr6.example9;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите символы:");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        char[] arr = str.toCharArray();
        System.out.println("Перевернутый массив: "+ Arrays.toString(Task9.array(arr)));
        in.close();
    }
}
