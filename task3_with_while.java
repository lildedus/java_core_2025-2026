package lr3;

import java.util.Scanner;

public class task3_with_while {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Сколько будет чисел Фибоначчи?");
        int size = in.nextInt();
        if (size <= 0){
            System.out.println("Ошибка ввода!");
        } else if (size == 1) {
            System.out.println("1");
        } else if (size == 2) {
            System.out.println("1, 1");
        } else {
            long a = 1, b = 1;
            System.out.print("1, 1");
            int i = 3;
            while (i<=size){
                long c = a + b;
                System.out.print(", "+c);
                a = b;
                b = c;
                i++;
            }
        }
    in.close();
    }
}
