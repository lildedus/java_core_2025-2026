package timus.second_semestr;

import java.util.Scanner;
import java.util.Arrays;

public class num_1617 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] wheels = new int[n];
        for (int i = 0; i < n; i++) {
            wheels[i] = in.nextInt();
        }
        Arrays.sort(wheels);
        int pairs = 0;
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (wheels[i] == wheels[i - 1]) {
                count++;
                if (count == 4) {
                    pairs++;
                    count = 0;
                }
            } else {
                count = 1;
            }
        }
        System.out.println(pairs);
        in.close();
    }
}