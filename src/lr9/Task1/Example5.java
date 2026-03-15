package lr9.Task1;

import java.util.Scanner;

public class Example5 {
    private static int step = 0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите длину последовательности числе Фибоначчи: ");
        int n = in.nextInt();
        in.close();
        System.out.println("Обход дерева рекурсивных вызовов: ");
        int result = Fibonacci(n);
        System.out.println("Результат:" + result);
    }
    public static int Fibonacci (int n){
        for (int i = 0; i < step; i++) {
            System.out.print(".");
        }
        System.out.println("fib("+n+") ->");
        step++;
        int result;
        if (n == 0) return 0;
        else if (n == 1) {
            return 1;
        } else {
            int n1 = Fibonacci(n-2), n2 = Fibonacci(n-1);
            result = n1 + n2;
        }
        step--;
        for (int i = 0; i < step; i++) {
            System.out.print(".");
        }
        System.out.println("fib("+n+")<- ");
        return result;
    }
}
