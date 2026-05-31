package timus.second_semestr;

import java.util.Scanner;

public class num_1881 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int w = in.nextInt();
        int n = in.nextInt();
        in.nextLine();
        int lines = 1;
        int currentLineLength = 0;
        for (int i = 0; i < n; i++) {
            String word = in.nextLine();
            if (currentLineLength == 0) {
                currentLineLength = word.length();
            } else if (currentLineLength + 1 + word.length() <= w) {
                currentLineLength += 1 + word.length();
            } else {
                lines++;
                currentLineLength = word.length();
            }
        }
        int pages = lines / h;
        if (lines % h != 0) {
            pages++;
        }
        System.out.println(pages);
        in.close();
    }
}