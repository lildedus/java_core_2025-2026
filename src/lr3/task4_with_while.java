package lr3;

import java.util.Scanner;

public class task4_with_while {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите два числа");
        int a = in.nextInt();
        int b = in.nextInt();
        int max = Math.max(a,b);
        int i = Math.min(a,b);
        while (i<max){
            System.out.print(i+", ");
            i++;
        }
        System.out.print(max);
    in.close();
    }
}
