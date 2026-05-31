package timus.second_semestr;

import java.util.Scanner;
import java.util.Arrays;

public class num_1496 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        String[] emails = new String[n];
        for (int i = 0; i < n; i++) {
            emails[i] = in.nextLine();
        }
        Arrays.sort(emails);
        for (int i = 0; i < n; i++) {
            if (i > 0 && emails[i].equals(emails[i - 1])) {
                if (i == 1 || !emails[i].equals(emails[i - 2])) {
                    System.out.println(emails[i]);
                }
            }
        }
        in.close();
    }
}
