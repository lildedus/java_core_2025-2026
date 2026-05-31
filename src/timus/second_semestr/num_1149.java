package timus.second_semestr;

import java.util.Scanner;

public class num_1149 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        StringBuilder result = new StringBuilder();
        for (int i = 1; i < n; i++) {
            result.append("(");
        }
        for (int i = 1; i <= n; i++) {
            result.append(sin(i));
            result.append("+").append(n - i + 1);
            if (i != n) {
                result.append(")");
            }
        }
        System.out.println(result.toString());
        in.close();
    }

    static String sin(int n) {
        StringBuilder s = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            s.append("sin(").append(i);
            if (i != n) {
                if (i % 2 == 1) {
                    s.append("-");
                } else {
                    s.append("+");
                }
            }
        }
        for (int i = 0; i < n; i++) {
            s.append(")");
        }
        return s.toString();
    }
}