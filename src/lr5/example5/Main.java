package lr5.example5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        Task5 task5 = new Task5();
        task5.setNum(in.nextInt());
        System.out.println(task5.getNum());
        in.close();
    }
}
