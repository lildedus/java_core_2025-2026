package timus.second_semestr;

import java.util.Scanner;

public class num_1991 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int leftBums = 0;
        int survivedDroids = 0;
        for (int i = 0; i < n; i++) {
            int bums = sc.nextInt();
            if (bums > k) {
                leftBums += bums - k;
            } else {
                survivedDroids += k - bums;
            }
        }
        System.out.println(leftBums + " " + survivedDroids);
        sc.close();
    }
}