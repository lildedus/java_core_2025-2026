package lr9.Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число для перевода в двоичную систему:");
        int num = in.nextInt();
        in.close();
        System.out.print("Введенное число в двоичной системе: ");
        binary(num);
    }
    public static void binary(int n){
        if (n > 1) binary(n / 2);
        System.out.print(n % 2);
    }
}
