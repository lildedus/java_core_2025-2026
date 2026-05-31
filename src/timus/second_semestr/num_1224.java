package timus.second_semestr;

import java.util.Scanner;

public class num_1224 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long m = in.nextLong();
        long result;
        if (n <= m) {
            result = 2 * n - 2;
        } else {
            result = 2 * m - 1;
        }
        System.out.println(result);
        in.close();
    }
}