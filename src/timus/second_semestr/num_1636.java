package timus.second_semestr;

import java.util.Scanner;

public class num_1636 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q1 = in.nextInt();
        int q2 = in.nextInt();
        int total = 0;
        for (int i = 0; i < 10; i++) {
            total += in.nextInt();
        }
        if (q2 - total * 20 >= q1) {
            System.out.println("No chance.");
        } else {
            System.out.println("Dirty debug :(");
        }
        in.close();
    }
}