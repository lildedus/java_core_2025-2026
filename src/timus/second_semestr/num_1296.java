package timus.second_semestr;

import java.util.Scanner;

public class num_1296 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int max = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            sum += x;
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        System.out.println(max);
        in.close();
    }
}