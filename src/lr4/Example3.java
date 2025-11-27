package lr4;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        System.out.println("Введите размеры двумерного массива:");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int[][] array = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                array[i][j] = 2;
            }
        }
        System.out.println("Прямоугольник из цифр 2:");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        in.close();
    }
}
