package lr6.example7;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите символы:");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        char[] chars = str.toCharArray();
        int[] result = Task7.arrayIndex(chars);
        System.out.println(Arrays.toString(result));
    }
}
