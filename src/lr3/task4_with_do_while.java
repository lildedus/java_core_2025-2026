package lr3;

import java.util.Scanner;

public class task4_with_do_while {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 2 числа");
        int a = in.nextInt();
        int b = in.nextInt();
        int max = Math.max(a,b);
        int i = Math.min(a,b);
        do {
            System.out.print(i+", ");
            i++;
        } while (i<max);
        System.out.print(max);
    in.close();
    }
}
