package timus.second_semestr;

import java.util.Scanner;
import java.util.Arrays;

public class num_1563 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        String[] shops = new String[n];
        for (int i = 0; i < n; i++) {
            shops[i] = in.nextLine();
        }
        Arrays.sort(shops);
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (shops[i].equals(shops[i - 1])) {
                count++;
            }
        }
        System.out.println(count);
        in.close();
    }
}