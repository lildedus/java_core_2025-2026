package timus.second_semestr;

import java.util.Scanner;
import java.util.HashSet;

public class num_1196 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashSet<Integer> dates = new HashSet<>();
        for (int i = 0; i < n; i++) {
            dates.add(in.nextInt());
        }
        int m = in.nextInt();
        int count = 0;
        for (int i = 0; i < m; i++) {
            if (dates.contains(in.nextInt())) {
                count++;
            }
        }
        System.out.println(count);
        in.close();
    }
}