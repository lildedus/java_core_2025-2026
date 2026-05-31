package timus.second_semestr;

import java.util.Scanner;

public class num_1110 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int y = in.nextInt();
        boolean found = false;
        for (int x = 0; x < m; x++) {
            long pow = 1;
            for (int i = 0; i < n; i++) {
                pow = (pow * x) % m;
            }
            if (pow == y) {
                System.out.print(x + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.println("-1");
        }
        in.close();
    }
}