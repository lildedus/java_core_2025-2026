package timus.second_semestr;
import java.util.Scanner;
public class num_1243 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int remainder = 0;
        for (int i = 0; i < s.length(); i++) {
            remainder = (remainder * 10 + (s.charAt(i) - '0')) % 7;
        }
        System.out.println(remainder);
        sc.close();
    }
}

