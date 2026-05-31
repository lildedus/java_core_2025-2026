package timus.second_semestr;

import java.util.Scanner;

public class num_2025 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int test = 0; test < t; test++) {
            int n = in.nextInt();
            int k = in.nextInt();
            int base = n / k;
            int remainder = n % k;
            long fights = 0;
            for (int i = 0; i < remainder; i++) {
                fights += (long)(base + 1) * (n - (base + 1));
                n -= (base + 1);
            }
            for (int i = remainder; i < k; i++) {
                fights += (long)base * (n - base);
                n -= base;
            }
            System.out.println(fights);
        }
        in.close();
    }
}