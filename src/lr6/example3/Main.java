package lr6.example3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Task3 task3 = new Task3();
        System.out.println("Введите несколько чисел: ");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] string = str.split(" ");
        int[] nums = new int[string.length];
        for (int i = 0; i < string.length; i++) {
            nums[i] = Integer.parseInt(string[i]);
        }
        System.out.println("Максимум: " + Task3.max(nums));
        System.out.println("Минимум: " + Task3.min(nums));
        System.out.println("Среднее: " + Task3.average(nums));
        in.close();
    }
}
