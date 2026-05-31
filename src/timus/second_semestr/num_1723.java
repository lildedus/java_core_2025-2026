package timus.second_semestr;

import java.util.Scanner;

public class num_1723 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }
        int max = 0;
        char best = 'a';
        for (int i = 0; i < 26; i++) {
            if (count[i] > max) {
                max = count[i];
                best = (char)('a' + i);
            }
        }
        System.out.println(best);
        in.close();
    }
}