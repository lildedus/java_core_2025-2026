package timus.second_semestr;

import java.util.Scanner;

public class num_1349 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n == 1) {
            System.out.println("1 2 3");
        } else if (n == 2) {
            System.out.println("3 4 5");
        } else {
            System.out.println("-1");
        }
        in.close();
    }
}