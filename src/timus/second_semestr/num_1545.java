package timus.second_semestr;

import java.util.Scanner;

public class num_1545 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] hieroglyphs = new String[n];
        for (int i = 0; i < n; i++) {
            hieroglyphs[i] = sc.nextLine();
        }
        char c = sc.nextLine().charAt(0);
        for (int i = 0; i < n; i++) {
            if (hieroglyphs[i].charAt(0) == c) {
                System.out.println(hieroglyphs[i]);
            }
        }
        sc.close();
    }
}