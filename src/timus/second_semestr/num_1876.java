package timus.second_semestr;

import java.util.Scanner;

public class num_1876 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int left = in.nextInt();
        int right = in.nextInt();
        int result = Math.max(2 * left + 39, 2 * right + 40);
        System.out.println(result);
        in.close();
    }
}